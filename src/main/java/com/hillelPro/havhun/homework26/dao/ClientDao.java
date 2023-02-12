package com.hillelPro.havhun.homework26.dao;

import com.hillelPro.havhun.homework26.entity.Client;
import com.hillelPro.havhun.homework26.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao {
    public void save(Client client) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();

    }
}
