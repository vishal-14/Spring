package demo.question6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/*
* Question 6
* Rename all the fields using column annotation.
* */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Create author
        Author4 author = new Author4();
        author.setFirstName("Douglas");
        author.setLastName("Adams");
        author.setAge(49);
        author.setId(1);
        author.setDateOfBirth(new Date());
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        System.out.println("Author5 created: " + author.toString());

        session.close();
        sessionFactory.close();
    }
}
