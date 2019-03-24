package demo.question5;

import demo.question1_2.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
* Question 5
* Perform hbm2dll create-drop by closing session factory.
* */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        //Create author
        Author3 author = new Author3();
        author.setFirstName("Jim");
        author.setLastName("Patterson");
        author.setAge(48);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        System.out.println("Author Created: "+author.toString());
        session.close();
        sessionFactory.close();
    }
}
