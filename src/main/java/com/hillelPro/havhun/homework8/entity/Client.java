package com.hillelPro.havhun.homework8.entity;

public class Client {
    final String identifier;
    final String surname;
    final String clientAccountID;
    final double summ;

    public String getIdentifier() {
        return identifier;
    }

    public String getSurname() {
        return surname;
    }

    public String getClientAccountID() {
        return clientAccountID;
    }

    public double getSumm() {
        return summ;
    }

    public Client(String identifier, String surname, String clientAccountID, double summ) {
        this.identifier = identifier;
        this.surname = surname;
        this.clientAccountID = clientAccountID;
        this.summ = summ;
    }
}


