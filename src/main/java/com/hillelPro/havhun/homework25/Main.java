package com.hillelPro.havhun.homework25;

import com.hillelPro.havhun.homework25.model.Account;
import com.hillelPro.havhun.homework25.model.Client;
import com.hillelPro.havhun.homework25.model.Status;
import com.hillelPro.havhun.homework25.service.AccountService;
import com.hillelPro.havhun.homework25.service.ClientService;
import com.hillelPro.havhun.homework25.service.StatusService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();

//       save client:

        Client client = new Client("vladaa", "vladaa@gmail.com",
                380973456073L, "something", 35);
//        clientService.save(client);
//       getById client:

        Client clientById = clientService.getById(3);
        System.out.println(clientById.toString());
//       update client:

        Client clientUpdateById = clientService.getById(18);
        clientUpdateById.setName("mikkit");
        clientUpdateById.setEmail("mikkit@gmail.com");
        clientUpdateById.setPhone(380965432167L);
        clientUpdateById.setAbout("something");
        clientUpdateById.setAge(28);
//        clientService.update(clientUpdateById);
//
//        System.out.println(clientUpdateById.toString());
        //       delete client:
        Client deleteById = clientService.getById(11);
//        clientService.delete(deleteById);

//        search client by phone number

        Client clientByPhoneNumber = clientService.getClientByPhoneNumber(380961235234L);
        System.out.println("reponse: " + clientByPhoneNumber.toString());


        AccountService accountService = new AccountService();

// create new account

        Account account = new Account(16, "Unit", 345345.0F);
//        accountService.save(account);

//        update account
        Account accountUpdateById = accountService.getById(4);
        accountUpdateById.setClient_id(17);
        accountUpdateById.setNumber("werwer");
        accountUpdateById.setValue(3333.0F);
//        accountService.update(accountUpdateById);

//      account by Id

        Account accountById = accountService.getById(6);
        System.out.println(accountById.toString());

//        delete account
        Account accountDeleteById = accountService.getById(9);
//        accountService.delete(accountDeleteById);


        StatusService statusService = new StatusService();

//          create status

        Status status = new Status("VIP", "some description");
//        statusService.save(status);

//        update status

        Status updateStatusById = statusService.getById(4);
        updateStatusById.setAlias("PLATINUM");
        updateStatusById.setDescription("update description");
//        statusService.update(updateStatusById);


//        status byId

        Status statusById = statusService.getById(4);
        System.out.println(statusById.toString());

//      delete status
        Status deletebyId = statusService.getById(3);
//        statusService.delete(deletebyId);

    }
}
