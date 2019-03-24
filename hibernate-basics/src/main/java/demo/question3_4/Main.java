package demo.question3_4;

/**
 * Question 3:
 * Use hbm2ddl create to introduce Date of Birth for Author
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Create author1
        Author2 author1 = new Author2();
        author1.setFirstName("Arthur Conan");
        author1.setLastName("Doyle");
        author1.setAge(71);
        author1.setId(1);
        author1.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author1);
        session.getTransaction().commit();
        System.out.println("Author2 created: " + author1.toString());
        /*
         * Use hbm2dll update to insert at least 4 records for Author.
         * Use hbm2dll update in config file
         * */

        // Create author2
        Author2 author2 = new Author2();
        author2.setFirstName("CS");
        author2.setLastName("Lewis");
        author2.setAge(64);
        author2.setId(2);
        author2.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author2);
        session.getTransaction().commit();
        System.out.println("Author2 created: " + author2.toString());

        // Create author3
        Author2 author3 = new Author2();
        author3.setFirstName("Enid");
        author3.setLastName("Blyton");
        author3.setAge(71);
        author3.setId(3);
        author3.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author3);
        session.getTransaction().commit();
        System.out.println("Author2 created: " + author3.toString());

        // Create author4
        Author2 author4 = new Author2();
        author4.setFirstName("Andy");
        author4.setLastName("Weir");
        author4.setAge(46);
        author4.setId(4);
        author4.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author4);
        session.getTransaction().commit();
        System.out.println("Author2 created: " + author4.toString());

        session.close();
    }
}
