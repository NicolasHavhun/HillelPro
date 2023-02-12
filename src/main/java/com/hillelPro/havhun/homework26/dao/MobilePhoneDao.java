package com.hillelPro.havhun.homework26.dao;

import com.hillelPro.havhun.homework26.util.HibernateConfiguration;
import com.hillelPro.havhun.homework26.entity.MobilePhoneNumber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MobilePhoneDao {
    public void save(MobilePhoneNumber mobilePhoneNumber) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(mobilePhoneNumber);
        transaction.commit();
        session.close();
    }
}
