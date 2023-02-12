package com.hillelPro.havhun.homework26.dao;

import com.hillelPro.havhun.homework26.entity.MobileProvider;
import com.hillelPro.havhun.homework26.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MobileProviderDao {
    public void save(MobileProvider mobileProvider) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(mobileProvider);
        transaction.commit();
        session.close();
    }

}
