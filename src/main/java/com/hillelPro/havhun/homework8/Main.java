package com.hillelPro.havhun.homework8;


import com.hillelPro.havhun.homework8.entity.Client;
import com.hillelPro.havhun.homework8.exception.WrongFieldException;
import com.hillelPro.havhun.homework8.exception.WrongSumException;
import com.hillelPro.havhun.homework8.service.TransactionService;
import com.hillelPro.havhun.homework8.utill.Helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        Client client = new Client("identifier", "Havhun", "0000000000", 500.00);
        TransactionService transactionService = new TransactionService();
        //       6.1
        String accountId;
        do {
            System.out.println("Input your Account ID: ");
            Scanner scanner = new Scanner(System.in);
            accountId = scanner.next();
            System.out.println("your Account ID: " + accountId);
            try {
                helper.idAccountValidation(accountId);

            } catch (WrongFieldException e) {
                System.out.println("your Account ID is Invalid");
                System.out.println("Repeat, you must input ten characters in that string");
            }
        } while (accountId.length() != 10);
//        6.2

        String accountRecipientId;
        do {
            System.out.println("Input Recipient Account ID: ");
            Scanner scanner = new Scanner(System.in);
            accountRecipientId = scanner.next();
            System.out.println("Recipient Account ID: " + accountRecipientId);
            try {
                helper.idAccountValidation(accountRecipientId);

            } catch (WrongFieldException e) {
                System.out.println("Recipient Account ID is Invalid");
                System.out.println("Repeat, you must input ten characters in that string");
            }
        } while (accountRecipientId.length() != 10);
//        6.3
        double sum = 0;
        do {
            try {
                System.out.println("Input Sum: ");
                Scanner scanner = new Scanner(System.in);
                sum = scanner.nextDouble();
                System.out.println("Sum is: " + sum);
                helper.sumValidation(sum);
            } catch (InputMismatchException e) {
                System.out.println("It's not the number, Input Sum correctly: ");
            } catch (WrongSumException e) {
                System.out.println("Sum  is Invalid");
                System.out.println("Repeat, you must input summ <1000");
            }
        } while (sum > 1000);
//  6.4

        transactionService.transferOfMoney(client, accountRecipientId);
        System.out.println("Money transfer was completed successfully");
    }
}
