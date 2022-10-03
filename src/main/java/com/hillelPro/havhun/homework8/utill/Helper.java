package com.hillelPro.havhun.homework8.utill;


import com.hillelPro.havhun.homework8.exception.UserExpectedError;
import com.hillelPro.havhun.homework8.exception.WrongSumException;

public class Helper {
    public void idAccountValidation(String accountId) throws WrongSumException {
        if (accountId.length() == 10) {
            System.out.println("clientAccountID is Valid");
        } else {
            throw new WrongSumException();

            }
    }

    public void sumValidation(double summ) throws WrongSumException {
        if (summ > 1000.00) {
            System.out.println("Summ is Valid");
        } else {
            throw new WrongSumException();

        }
    }

    public void transactionValidation(String idFirstClient, String idSecondClient) {
        if (idFirstClient == idSecondClient) {
            System.out.println("clientAccountID is Valid");
        } else {
            throw new UserExpectedError();

        }
    }
}