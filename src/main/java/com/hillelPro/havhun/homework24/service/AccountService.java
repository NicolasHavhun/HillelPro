package com.hillelPro.havhun.homework24.service;

import com.hillelPro.havhun.homework24.util.Database;
import com.hillelPro.havhun.homework24.entity.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private String QUERY_GET_ALL = "SELECT * FROM accounts";
    private String QUERY_SAVE = "INSERT INTO accounts ( id, client_id, number, value) VALUES (?,?,?,?)";
    private String QUERY_UPDATE = "UPDATE accounts SET client_id = ?, number = ?, value = ? WHERE id = ?";
    private String QUERY_DELETE = "DELETE FROM accounts WHERE id = ?";
    private String QUERY_VALUE = "SELECT * FROM accounts WHERE value > ?";

    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClient_id(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getFloat("value"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void create(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);

            preparedStatement.setInt(1, account.getId());
            preparedStatement.setInt(2, account.getClient_id());
            preparedStatement.setString(3, account.getNumber());
            preparedStatement.setFloat(4, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(Account account, Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(4, id);
            preparedStatement.setInt(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setFloat(3, account.getValue());
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

    public Account getClientByValue(float valueAccount) {
        Account account = new Account();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_VALUE)) {
            connection.setAutoCommit(false);
            preparedStatement.setLong(1, (long) valueAccount);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int client_id = resultSet.getInt("client_id");
                String number = resultSet.getString("number");
                float value = resultSet.getFloat("value");

                System.out.println("id - " + id + ", client_id - " + client_id + ", number -  " + number + ", value - "
                        + value);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;


    }

}
