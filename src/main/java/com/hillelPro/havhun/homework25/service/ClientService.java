package com.hillelPro.havhun.homework25.service;

import com.hillelPro.havhun.homework25.dao.ClientDao;
import com.hillelPro.havhun.homework25.model.Client;

public class ClientService {
    private final ClientDao clientDao = new ClientDao();

    public void save(Client client) {
        if (client == null) {
            System.out.println("client is null");
        }
        clientDao.save(client);
    }

    public void update(Client client) {
        if (client == null) {
            System.out.println("client is null");
        }
        clientDao.update(client);
    }

    public Client getById(int id) {
        Client client = clientDao.getById(id);

        return client;
    }

    public void delete(Client client) {
        if (client == null) {
            System.out.println("client is null");
        }
        clientDao.delete(client);
    }

    public Client getClientByPhoneNumber(long phone) {
        return clientDao.getClientByPhone(phone);
    }
}
