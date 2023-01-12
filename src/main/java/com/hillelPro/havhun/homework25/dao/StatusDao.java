package com.hillelPro.havhun.homework25.dao;

import com.hillelPro.havhun.homework25.model.Status;
import com.hillelPro.havhun.homework25.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDao {
    public void save(Status status){
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(status);
        transaction.commit();
        session.close();
    }
    public void update(Status status){
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(status);
        transaction.commit();
        session.close();
    }

    public Status getById(int id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        Status status = session.get(Status.class, id);

        transaction.commit();
        session.close();
        return status;
    }
    public void delete(Status status){
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(status);
        transaction.commit();
        session.close();
    }

}
