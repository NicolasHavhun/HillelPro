package com.hillelPro.havhun.homework11;


import java.util.*;

public class InitializationData {

    static ArrayList<String> name = new ArrayList<>();
    static HashSet<String> mail = new HashSet<>();
    static HashMap<String, String> mailName = new HashMap<String, String>();

    public static Information getSetDataForTest() {
        for (int j = 0; j < 30; j++) {
            int length = 3;
            Random r = new Random();
            String randomString = r.ints(48, 122)
                    .filter(i -> (i < 57 || i > 65) && (i < 90 || i > 97))
                    .mapToObj(i -> (char) i)
                    .limit(length)
                    .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                    .toString();
            name.add("User " + randomString);
            mail.add(randomString + "@gmail.com");
            mailName.put(randomString + "@gmail.com", "User " + randomString);
        }
        System.out.println("Username list: " + name);
        System.out.println("Mail list: " + mail);
        System.out.println("Map list: " + mailName);
        System.out.println("Username list size: " + name.size());
        System.out.println("Mail list size: " + mail.size());
        System.out.println("Map list size: " + mailName.size());
        for (int j = 0; j < 10; j++) {
            name.add("ten identical values ");
            mail.add("ten identical values ");
            mailName.put("ten identical values ", "ten identical values ");
        }
        System.out.println("Username list: " + name);
        System.out.println("Mail list: " + mail);
        System.out.println("Map list: " + mailName);
        System.out.println("Username list size: " + name.size());
        System.out.println("Mail list size: " + mail.size());
        System.out.println("Map list size: " + mailName.size());

        List<String> uniqueName = uniqueNameChangeSize(name);


        return uniqueValuesUser(mail, mailName, uniqueName);
    }

    private static List<String> uniqueNameChangeSize(List<String> name) {
        Set<String> nameToSet = new HashSet<>(name);
        List<String> uniqueName = new ArrayList<>(nameToSet);
        System.out.println("Unique name list in uniqueNameChangeSize : " + uniqueName);
        System.out.println("Unique name Array size in uniqueNameChangeSize : " + uniqueName.size());
        return uniqueName;
    }

    private static Information uniqueValuesUser(Set<String> mail, Map<String, String> mailName, List<String> uniqueName) {
        if (uniqueName.size() == mail.size() && uniqueName.size() == mailName.size()) {
            Information user = new Information((ArrayList<String>) uniqueName, mail, (HashMap<String, String>) mailName);
            return user;
        }
        return null;
    }
}


