package com.hillelPro.havhun.homework11;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Information newUser = InitializationData.getSetDataForTest();

        ArrayList<Byte> byteList = new ArrayList<>();
        byteList.add((byte) 12);
        byteList.add((byte) -127);
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(123123);
        integerList.add(897786);
        ArrayList<Long> longList = new ArrayList<>();
        longList.add((long) -123456);
        longList.add((long) 789_789_789);
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(123.32);
        doubleList.add(Math.E);
        Information changedUser = changedInformation(byteList, newUser);
        changedInformation(byteList, newUser);
        changedInformation(integerList, newUser);
        changedInformation(longList, newUser);
        changedInformation(doubleList, newUser);
        System.out.println("Username changed list:" + newUser.getUserName());
        System.out.println("Mail changed list : " + newUser.getMail());
        System.out.println("Map mailName changed list : " + newUser.getMailName());
        System.out.println("Username changed list size: " + newUser.getUserName().size());
        System.out.println("Mail changed list size: " + newUser.getMail().size());
        System.out.println("Map mailName changed list size: " + newUser.getMailName().size());

    }

    private static Information changedInformation(List<? extends Number> numbersList, Information user) {
        for (Number numb : numbersList) {
            String stringFromNumber = numb.toString();
            String newMail = stringFromNumber + "@mail.ua";
            if (!user.getMail().contains(newMail)) {
                user.getUserName().add(stringFromNumber);
                user.getMail().add(newMail);
                user.getMailName().put(newMail, stringFromNumber);
//            } else {
//                user.getUserName().add(stringFromNumber);
//                user.getMailName().put(newMail, stringFromNumber);
            }
        }

        return user;
    }
}
