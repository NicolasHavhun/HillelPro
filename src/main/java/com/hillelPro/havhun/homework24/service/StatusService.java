package com.hillelPro.havhun.homework24.service;

import com.hillelPro.havhun.homework24.util.Database;
import com.hillelPro.havhun.homework24.entity.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatusService {
    private String QUERY_GET_ALL = "SELECT * FROM statuses";
    private String QUERY_SAVE = "INSERT INTO statuses ( id, alias, description) VALUES (?,?,?)";
    private String QUERY_UPDATE = "UPDATE statuses SET alias = ?, description = ? WHERE id = ?";
    private String QUERY_DELETE = "DELETE FROM statuses WHERE id = ?";

    public List<Status> getAll() {
        List<Status> statuses = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Status status = new Status();
                status.setId(resultSet.getInt("id"));
                status.setAlias(resultSet.getString("alias"));
                status.setDescription(resultSet.getString("description"));

                statuses.add(status);

            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statuses;
    }

    public void create(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);

            preparedStatement.setInt(1, status.getId());
            preparedStatement.setString(2, status.getAlias());
            preparedStatement.setString(3, status.getDescription());

            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Status status, Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(3, id);
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
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

}
