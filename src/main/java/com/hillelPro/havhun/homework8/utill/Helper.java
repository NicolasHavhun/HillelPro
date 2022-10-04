package com.hillelPro.havhun.homework8.utill;


import com.hillelPro.havhun.homework8.exception.UserExpectedError;
import com.hillelPro.havhun.homework8.exception.WrongFieldException;
import com.hillelPro.havhun.homework8.exception.WrongSumException;

public class Helper {
    public void idAccountValidation(String accountId) throws WrongFieldException {
        if (accountId.length() == 10) {
            System.out.println("clientAccountID is Valid");
        } else {
            throw new WrongFieldException();

        }
    }

    public void sumValidation(double summ) throws WrongSumException {
        if (summ < 1000.00) {
            System.out.println("Sum is Valid");
        } else {
            throw new WrongSumException();

        }
    }

    public void transactionValidation(String idFirstClient, String idSecondClient) {
        if (idFirstClient.hashCode() == idSecondClient.hashCode()) {
            System.out.println("clientAccountID is Valid");
        } else {
            throw new UserExpectedError();

        }
    }
}