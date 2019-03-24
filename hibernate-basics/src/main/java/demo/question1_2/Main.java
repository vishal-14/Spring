package demo.question1_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        /*
         * Question 2
         * Perform CRUD operation for Author class.
         * */
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        //Create author
        Author author = new Author();
        author.setFirstName("Jim");
        author.setLastName("Patterson");
        author.setAge(48);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        System.out.println("Author Created: "+author.toString());
        //Read author
        session.beginTransaction();
        Author author1 = session.get(Author.class,"Patterson");
        session.getTransaction().commit();
        System.out.println("Author read: " + author1.toString());

        // Update author
        session.beginTransaction();
        Author author2 = session.get(Author.class, "Patterson");
        author.setFirstName("Joanne K");
        session.update(author2);
        session.getTransaction().commit();
        System.out.println("Author updated: " + author2.toString());

        // Delete author
        session.beginTransaction();
        Author author3 = session.get(Author.class, "Patterson");
        session.delete(author3);
        session.getTransaction().commit();
        session.close();
        System.out.println("Author deleted: " + author3.toString());
        session.close();
    }
}
