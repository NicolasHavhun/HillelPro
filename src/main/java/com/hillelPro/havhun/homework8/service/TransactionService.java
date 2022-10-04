package com.hillelPro.havhun.homework8.service;

import com.hillelPro.havhun.homework8.entity.Client;
import com.hillelPro.havhun.homework8.utill.Helper;

public class TransactionService {
    public void transferOfMoney(Client client, String accountId) {
        Helper helper = new Helper();
        client = new Client("identifier", "Havhun", "0000000000", 500.00);
        helper.transactionValidation(client.getClientAccountID(), accountId);


    }
}
