package com.hillelPro.havhun.homework3;

public class Support extends User {


    public Support(String name, String password) {
        super(name, password);

    }

    public Support(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }




    public static void validationSupport(String firstString, String secondString){


        System.out.println("Есть ли слово " +'\''+secondString+ '\''+" в стихе?: "+'\n'+firstString+
                "- "
                + firstString.regionMatches(true, 8, secondString, 0, 4));
        System.out.println();
    }
}

