package com.hillelPro.havhun.homework9;

import java.io.*;
import java.util.Scanner;

public class ValidationService {
    public void registration() throws IOException {
        System.out.println("Input your login: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.next();
        System.out.println("your login: " + login);
        System.out.println("Input your password: ");
        String passwordOne = scanner.next();
        System.out.println("Input your password again: ");
        String passwordTwo = scanner.next();
        if (passwordOne.equals(passwordTwo)) {
            System.out.println("Password is Valid " + passwordOne);
            FileWriter fileWriter = new FileWriter("src/main/java/resources/registration/users.txt", true);
            fileWriter.write("login: " + login + "\n");
            fileWriter.write("password: " + passwordTwo + "\n");
            fileWriter.close();
            System.out.println("Your Account was saved");
        } else {
            System.out.println("Password is Invalid");
            return;
        }
    }

    public void login() throws IOException {
        int count = 0;
        do {
            System.out.println("Input your login: ");
            Scanner scanner = new Scanner(System.in);
            String login = scanner.nextLine();
            System.out.println("Input your password: ");
            String password = scanner.nextLine();
            System.out.println("your login: " + login + "\n" + "your password: " + password);

            FileInputStream fis = new FileInputStream("src/main/java/resources/registration/users.txt");
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String line = "";

            while ((line = br.readLine()) != null) {

                if (line.equals("login: " + login)) {
                    System.out.println("Hello " + login);
                    if (br.readLine().equals("password: " + password)) {
                        System.out.println("Authorization successful");
                        return;
                    } else {
                        System.out.println("Invalid Password");
                        count++;
                    }
                }
            }
                System.out.println("Repeat: ");
            br.close();
            isr.close();
            fis.close();
        } while (count < 3);
        System.out.println("Try again, Bye");
        return;
    }
}

