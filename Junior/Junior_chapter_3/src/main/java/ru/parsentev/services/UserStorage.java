package ru.parsentev.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.parsentev.models.User;

public class UserStorage {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        User user = new User();
        user.setId(2);
        user.setLogin("Mr.Second");
        user.setPassword("sec0nd");
        // Create TimeStamp object
        java.util.Date date = new java.util.Date();
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
        // ---
        user.setCreated(timestamp);
        session.saveOrUpdate(user);
        System.out.println(session.createQuery("from User").list());
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
