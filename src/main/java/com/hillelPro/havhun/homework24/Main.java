package com.hillelPro.havhun.homework24;

import com.hillelPro.havhun.homework24.entity.Client;
import com.hillelPro.havhun.homework24.entity.ClientStatus;
import com.hillelPro.havhun.homework24.entity.Status;
import com.hillelPro.havhun.homework24.service.AccountService;
import com.hillelPro.havhun.homework24.service.ClientService;
import com.hillelPro.havhun.homework24.service.ClientStatusService;
import com.hillelPro.havhun.homework24.service.StatusService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//CRUD for Account
//
        AccountService accountService = new AccountService();
//        List<Account> accounts = accountService.getAll();
//        accounts.forEach(System.out::println);
//
//
//        Account accountCreate = new Account();
//        accountCreate.setClient_id(11);
//        accountCreate.setNumber("jklj");
//        accountCreate.setValue(32444400.2F);
//        accountService.create(accountCreate);

//        Account accountUpdate = new Account();
//        accountUpdate.setClient_id(5);
//        accountUpdate.setNumber("UpdateExample");
//        accountUpdate.setValue(123123.0F);
//        accountService.update(accountUpdate, 9);

//        accountService.delete(0);

//        CRUD for Client
        ClientService clientService = new ClientService();
        List<Client> clients = clientService.getAll();
        clients.forEach(System.out::println);

//        Client client = new Client("mama", "mama@gmail.com", 80963451323L, "something");
//        clientService.create(client);

//        Client clientUpdate = new Client();
//
//        clientUpdate.setName("bob");
//        clientUpdate.setEmail("bob@gmail.com");
//        clientUpdate.setPhone(280985673546L);
//        clientUpdate.setAbout("something");
//        clientService.update(clientUpdate, 2);

//        clientService.delete(12);


//Read for Client Status


        ClientStatusService clientStatusService = new ClientStatusService();
        List<ClientStatus> clientStatuses = clientStatusService.getAll();
        clientStatuses.forEach(System.out::println);


//CRUD for Status

        StatusService statusService = new StatusService();
        List<Status> statuses = statusService.getAll();
        statuses.forEach(System.out::println);

//        Status status = new Status(4, "BEST", "some description");
//        statusService.create(status);

//        Status statusUpdate = new Status();
//
//        statusUpdate.setAlias("BESTER");
//        statusUpdate.setDescription("some descrioption");

//        statusService.update(statusUpdate, 4);

//        statusService.delete(4);

//        4.
        clientService.getClientByPhone(380981235098L);

//        5.
        accountService.getClientByValue(123123F);
//        6.
        clientService.getByIdAccount();
//        7.
//        ALTER TABLE IF EXISTS public.clients
//    ADD COLUMN age integer
//        UPDATE clients SET age=32 WHERE id=1;
//        UPDATE clients SET age=17 WHERE id=0;
//        UPDATE clients SET age=18 WHERE id=2;
//        UPDATE clients SET age=15 WHERE id=3;
//        UPDATE clients SET age=10 WHERE id=4;
//        UPDATE clients SET age=25 WHERE id=5;
//        UPDATE clients SET age=34 WHERE id=6;
//        UPDATE clients SET age=55 WHERE id=7;
//        UPDATE clients SET age=48 WHERE id=8;
//        UPDATE clients SET age=23 WHERE id=9;
//        UPDATE clients SET age=86 WHERE id=10
        System.out.println("Clients where age>18");
        System.out.println(clientService.getClientByAge());


    }
}
