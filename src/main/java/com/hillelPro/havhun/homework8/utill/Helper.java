package com.hillelPro.havhun.homework8.utill;



public class Helper {
    public void idAccountValidation(String str) {
        if (str.length() == 10) {
            System.out.println("clientAccountID is Valid");
        } else {

        }
    }

    public void summValidation(double summ) {
        if (summ > 1000.00) {
            System.out.println("Summ is Valid");
        } else {

        }
    }

    public void transactionValidation(String idFirstClient, String idSecondClient) {
        if (idFirstClient == idSecondClient) {
            System.out.println("clientAccountID is Valid");
        } else {

        }
    }
}