package com.hillelPro.havhun.homework26.service;

import com.hillelPro.havhun.homework26.dao.ClientDao;
import com.hillelPro.havhun.homework26.entity.Client;

public class ClientService {
    private final ClientDao clientDao = new ClientDao();

    public void save(Client client){
        clientDao.save(client);
    }
 }
