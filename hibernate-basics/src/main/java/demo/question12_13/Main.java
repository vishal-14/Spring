package demo.question12_13;
/*
 * Question 12
 * Introduce a List of subjects for author.
 * Question 13
 * Persist 3 subjects for each author.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Create author1
        Author author1 = new Author();
        author1.setFirstName("Andrew");
        author1.setLastName("Tanenbaum");
        author1.setAge(75);
        author1.setId(1);
        author1.setDateOfBirth(new Date());
        List<String> subjectList = Arrays.asList(
                "Computer Networks",
                "Computer Organisation",
                "Operating Systems");
        author1.setListOfSubjects(subjectList);
        session.beginTransaction();
        session.save(author1);
        session.getTransaction().commit();
        System.out.println("Author created: " + author1.toString());

        // Create author2
        Author author2 = new Author();
        author2.setFirstName("Alan");
        author2.setLastName("Turing");
        author2.setAge(41);
        author2.setId(2);
        author2.setDateOfBirth(new Date());
        List<String> subjectList2 = Arrays.asList(
                "Chemistry",
                "Biology",
                "Computer Science");
        author2.setListOfSubjects(subjectList2);
        session.beginTransaction();
        session.save(author2);
        session.getTransaction().commit();
        System.out.println("Author created: " + author2.toString());

        session.close();
        sessionFactory.close();
    }
}
