package com.hillelPro.havhun.homework25.dao;

import com.hillelPro.havhun.homework25.model.Account;
import com.hillelPro.havhun.homework25.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDao {
    public void save(Account account) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(account);
        transaction.commit();
        session.close();
    }

    public void update(Account account) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(account);
        transaction.commit();
        session.close();
    }

    public Account getById(int id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        Account account = session.get(Account.class, id);

        transaction.commit();
        session.close();
        return account;
    }

    public void delete(Account account) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(account);
        transaction.commit();
        session.close();
    }
}
