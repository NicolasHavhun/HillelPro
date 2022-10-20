package com.hillelPro.havhun.homework11;


import java.util.Random;

public class InitializationData {

    Information information = new Information();

    public void getSetDataForTest() {

        for (int j = 0; j < 30; j++) {

            int length = 3;
            Random r = new Random();
            String randomString = r.ints(48, 122)
                    .filter(i -> (i < 57 || i > 65) && (i < 90 || i > 97))
                    .mapToObj(i -> (char) i)
                    .limit(length)
                    .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                    .toString();
            information.list.add("User " + randomString);
            information.mail.add(randomString + "@gmail.com");
        }
        information.mailName.put(information.list, information.mail);

        System.out.println("Username list: " + information.list);
        System.out.println("Mail list: " + information.mail);
        System.out.println("Map list: " + information.mailName);
        System.out.println("Username list size: " + information.list.size());
        System.out.println("Mail list size: " + information.mail.size());
        System.out.println("Map list size: " + information.mailName.size());

    }
}


