package com.hillelPro.havhun.homework25.service;

import com.hillelPro.havhun.homework25.dao.AccountDao;
import com.hillelPro.havhun.homework25.model.Account;

public class AccountService {
    private final AccountDao accountDao = new AccountDao();

    public void save(Account account) {
        if (account == null) {
            System.out.println("account is null");
        }
        accountDao.save(account);
    }

    public void update(Account account) {
        if (account == null) {
            System.out.println("account is null");
        }
        accountDao.update(account);
    }

    public Account getById(int id) {
        Account account = accountDao.getById(id);

        return account;
    }

    public void delete(Account account) {
        if (account == null) {
            System.out.println("account is null");
        }
        accountDao.delete(account);
    }
}
