package com.hillelPro.havhun.homework24.service;

import com.hillelPro.havhun.homework24.util.Database;
import com.hillelPro.havhun.homework24.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ClientService {

    private String QUERY_GET_ALL = "SELECT * FROM clients";
    private String QUERY_SAVE = "INSERT INTO clients ( id, name, email, phone, about) VALUES (?,?,?,?,?)";
    private String QUERY_UPDATE = "UPDATE clients SET name = ?, email = ?, phone = ?, about = ? WHERE id = ?";
    private String QUERY_DELETE = "DELETE FROM clients WHERE id = ?";
    private String QUERY_PHONE = "SELECT * FROM clients WHERE phone = ?";
    private String QUERY_CLIENT_ID = "SELECT * FROM clients AS c INNER JOIN accounts a ON c.id = a.client_id";
    private String QUERY_BY_AGE_MORE_18 = "SELECT c.name, c.email, s.alias FROM clients AS c INNER JOIN " +
            "client_status as cls ON c.id = cls.client_id INNER JOIN statuses s ON cls.status_id = s.id WHERE age > 18";


    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));
                clients.add(client);

            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void create(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);

            preparedStatement.setInt(1, client.getId());
            preparedStatement.setString(2, client.getName());
            preparedStatement.setString(3, client.getEmail());
            preparedStatement.setLong(4, client.getPhone());
            preparedStatement.setString(5, client.getAbout());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(Client client, Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(5, id);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setLong(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete(Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Client getClientByPhone(long clientPhone) {
        Client client = new Client();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_PHONE)) {
            connection.setAutoCommit(false);
            preparedStatement.setLong(1, clientPhone);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                long phone = resultSet.getLong("phone");
                String about = resultSet.getString("about");
                System.out.println("id - " + id + ", name - " + name + ", email -  " + email + ", phone - "
                        + phone + ", about - " + about);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;

    }

    public List<Client> getByIdAccount() {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_CLIENT_ID);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;

    }

    public List<String> getClientByAge() {
        List<String> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_BY_AGE_MORE_18);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String alias = resultSet.getString("alias");
                clients.add(name);
                clients.add(email);
                clients.add(alias + ", \n");

            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
}
