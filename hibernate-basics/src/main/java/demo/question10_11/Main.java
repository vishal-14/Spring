package demo.question10_11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        //Create author
        Author author = new Author();
        author.setFirstName("Jim");
        author.setLastName("Patterson");
        author.setAge(48);
        author.setId(1);
        author.setDateOfBirth(new Date());
        Address address = new Address();
        address.setState("New York");
        address.setStreetNumber("200, Central Park West");
        address.setLocation("United States of America");
        author.setAddress(address);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        System.out.println("Author Created: "+author.toString());

        session.close();
    }
}
