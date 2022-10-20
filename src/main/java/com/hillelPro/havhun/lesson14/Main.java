package com.hillelPro.havhun.lesson14;

import com.hillelPro.havhun.lesson14.entity.Admin;
import com.hillelPro.havhun.lesson14.entity.Client;
import com.hillelPro.havhun.lesson14.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        //В этой коллекции класть эдементы типа String
//       final ArrayList stringList = new ArrayList();
//       stringList.add(10);
//       stringList.add("String");
//       stringList.add(new Client());
//       checkListWithEntitys(stringList);
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("str");
//        System.out.println(strings);
//        ArrayList<Client> clients = new ArrayList<Client>();
//        clients.add(new Client());
//        System.out.println(clients+" client");
//        ArrayList<Integer> integers = new ArrayList<Integer>();
//        integers.add(10);
//        integers.add(20);
//        integers.add(30);
//
        ArrayList<Long> longs = new ArrayList<>();
        long valLong = 20;
        longs.add(10l);
        longs.add(valLong);

        HashSet<String> hashSet = new HashSet<String>();
        HashMap<String, Client> stringClientHashMap = new HashMap<String, Client>();
        stringClientHashMap.put("Nico", new Client());
        stringClientHashMap.put("Bob", new Client());
        stringClientHashMap.put("Admin", new Admin());
        System.out.println(stringClientHashMap);

        ArrayList<ArrayList<String>> objectArrayList = new ArrayList<>();
        ArrayList<String> strings1 = new ArrayList<>();
        objectArrayList.add(strings1);


        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client());
        clients.add(new User());
        clients.add(new Admin());
        //  checkListWithAnyEntities(clients);
        ArrayList<Admin> admins = new ArrayList<>();
        admins.add(new Admin());
//        admins.add(new User());
        //  admins.add(new Client());
        ArrayList<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new Admin());
//        users.add(new Client());
        checkListWithExtendsWildcardGemeric(clients);
        checkListWithExtendsWildcardGemeric(users);
        checkListWithExtendsWildcardGemeric(admins);

        checkListWithSuperWildcard(clients);
        checkListWithSuperWildcard(users);
//        checkListWithSuperWildcard(admins);

    }

    private static void checkListWithExtendsWildcardGemeric(ArrayList<? extends Client> clients) {
        for (Client client : clients) {
            client.say();
            client.setName("changed name");
        }
//        clients.add(new Client());

    }

    private static void checkListWithSuperWildcard(ArrayList<? super User> clients) {


//       clients.add(new Client());
        clients.add(new User());
        clients.add(new Admin());


//    private static void checkListWithAnyEntities(ArrayList list) {
//        for (Object string : list) {
//            System.out.println(string);
//
//        }

    }
}
