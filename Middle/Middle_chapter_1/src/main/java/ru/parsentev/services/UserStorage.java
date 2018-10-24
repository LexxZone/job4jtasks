package ru.parsentev.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.parsentev.models.Item;
import ru.parsentev.models.User;

import java.sql.Timestamp;

/**
 * 21.10.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class UserStorage {

    public static void main(String[] args) {

        // Transient
        User user = new User();
        user.setLogin("test");


        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        //session.save(user);

        Item item = session.get(Item.class, 1);
        System.out.println(item);


        // ============= after save - persistent ========================

        //session.evict(user);
        //user.setLogin("update");





        //System.out.println(session.createQuery("from User").list());
        session.getTransaction().commit();
        session.close();
        factory.close();

    }
}
