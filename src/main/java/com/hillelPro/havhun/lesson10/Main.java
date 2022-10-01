package com.hillelPro.havhun.lesson10;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RuntimeException {
//        SQLException
        String string = "example";
        checkString(string);
        checkString(null);
//        NullPointerException
        ExceptionServise exceptionServise = new ExceptionServise();
//        exceptionServise.throwCheckedException();

//        exceptionServise.throwUncheckedException();
//        throw new MyCastomException();
//        try {
//            exceptionServise.throwCheckedException();
//        } catch (IOException e) {
//            System.out.println("IO Exception");
////            exceptionServise.throwUncheckedException();
//        } finally {
//            System.out.println("finally step in try-catch");
//            exceptionServise.throwUncheckedException();
//        }

//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Enter your name");
//            String name = scanner.next();
//            System.out.println("your name "+name);
//            exceptionServise.throwCheckedException();
//        } catch (Exception e){
//            scanner = null;
//        } finally {
//            System.out.println("!!!");
//            scanner.close();
    }
//        try(Scanner scanner = new Scanner(System.in)){
//
//    } catch(Exception e)
//
//    {
//
//    }


    private static void checkString(String string) {
        if (string == null) {
            System.out.println("string is null");
        } else {
            System.out.println("string.length() " + string.length());
        }
    }
}
