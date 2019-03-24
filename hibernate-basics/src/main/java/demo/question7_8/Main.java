package demo.question7_8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Question 7:
 * Mark lastName as @Transient
 * Question 8:
 * Use @Temporal for date of birth of Author
 */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Create author
        Author5 author = new Author5();
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
