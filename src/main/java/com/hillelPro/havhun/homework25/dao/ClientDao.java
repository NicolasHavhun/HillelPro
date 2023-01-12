package com.hillelPro.havhun.homework25.dao;

import com.hillelPro.havhun.homework25.model.Client;
import com.hillelPro.havhun.homework25.util.HibernateConfiguration;
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

    public void update(Client client) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(client);

        transaction.commit();
        session.close();

    }

    public Client getById(int id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        Client client = session.get(Client.class, id);

        transaction.commit();
        session.close();
        return client;
    }

    public void delete(Client client) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(client);

        transaction.commit();
        session.close();

    }

    public Client getClientByPhone(long phone) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Client client = (Client) session.createQuery("FROM Client WHERE phone = :ph")
                .setParameter("ph", phone)
                .getSingleResult();
        transaction.commit();
        session.close();

        return client;
    }
}
