package com.hillelPro.havhun.homework26;

import com.hillelPro.havhun.homework26.entity.Account;
import com.hillelPro.havhun.homework26.entity.Client;
import com.hillelPro.havhun.homework26.entity.MobilePhoneNumber;
import com.hillelPro.havhun.homework26.entity.MobileProvider;
import com.hillelPro.havhun.homework26.service.MobileProviderService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        MobileProviderService mobileProviderService = new MobileProviderService();
        MobileProvider mobileProvider = new MobileProvider();
        mobileProvider.setName("Kyivstar");
        Client client = new Client();
        client.setId(2);
        client.setAge(34);
        client.setAbout("something");
        client.setName("Andrew");
        client.setEmail("andrew@gmail.com");
        client.setPhone(80973214543L);
        final HashSet<Account> accountHashSet = new HashSet<>();
        final HashSet<Client> clients = new HashSet<>();
        clients.add(client);
        MobilePhoneNumber mobilePhoneNumber = new MobilePhoneNumber();
        mobilePhoneNumber.setNumber(8096356245L);
        mobilePhoneNumber.setClient(client);
        client.setMobilePhoneNumber(mobilePhoneNumber);
        client.setStatuses(new HashSet<>());
        mobileProvider.setClient(client);
        mobileProviderService.save(mobileProvider);

//
//
//        MobilePhoneService mobilePhoneService = new MobilePhoneService();
//
//        mobilePhoneService.save(mobilePhoneNumber);

//        ClientService clientService = new ClientService();
//
//        clientService.save(client);
//
//        clients.add(client);
//        Account account = new Account();
//        account.setNumber("some");
//        account.setValue(1000.00F);
//        client.setStatuses(statuses);
//        final Set<MobileProvider> mobileProviders = new HashSet<>();
//        client.setMobileProviders(mobileProviders);
//        client.setMobileProviders(new HashSet<>());
//        mobilePhoneNumber.setClient(client);



    }
}
