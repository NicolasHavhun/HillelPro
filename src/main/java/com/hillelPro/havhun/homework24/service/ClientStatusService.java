package com.hillelPro.havhun.homework24.service;

import com.hillelPro.havhun.homework24.util.Database;
import com.hillelPro.havhun.homework24.entity.ClientStatus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientStatusService {
    public List<ClientStatus> getAll() {
        List<ClientStatus> clientStatuses = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM client_status");
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                ClientStatus clientStatus = new ClientStatus();
                clientStatus.setClientId(resultSet.getInt("client_id"));
                clientStatus.setStatusId(resultSet.getInt("status_id"));

                clientStatuses.add(clientStatus);

            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientStatuses;
    }
}
