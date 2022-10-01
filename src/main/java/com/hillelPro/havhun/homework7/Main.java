package com.hillelPro.havhun.homework7;


import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        stringHelper.helper(" Nicolas ", new char[]{' ', 'a', 'B', 'c'});
        System.out.println();
        String testString = "0962785098";
        phoneNumberValidation(testString);
        String myMail = "nicolas.havhun@gmail.com";
        validationEmailAddress(myMail);
        String date = "31.12.2010";
        dateValidation(date);
    }
    public static void phoneNumberValidation(String string) {
        // Здесь я выбрал короткую и емкую валидацию: Могут содержать/не содержать символы +38, далее 0 обязательно, далее 9 любых цифр.
        String str = "^(?:(\\+)?38)?(0\\d{9})$";
        if (Pattern.compile(str).matcher(string).matches()) {
            System.out.println("Phone number is Valid");
        } else {
            System.out.println("Phone number is Invalid");
        }
    }
    public static void validationEmailAddress(String email) {
        String str = "^[\\p{L}0-9!#$%&'*+\\/=?^_`{|}~-][\\p{L}0-9.!#$%&'*+\\/=?^_`{|}~-]{0,63}@[\\p{L}0-9-]+(?:\\.[\\p{L}0-9-]{2,7})*$";
        if (Pattern.compile(str).matcher(email).matches()) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Email is Invalid");
        }
    }
    public static void dateValidation(String date) {
        String str = "(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)";
        if (Pattern.compile(str).matcher(date).matches()) {
            System.out.println("Date format is Valid");
        } else {
            System.out.println("Date format is Invalid");
        }
    }
}


