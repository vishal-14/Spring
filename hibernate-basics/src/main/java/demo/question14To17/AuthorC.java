package demo.question14To17;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class AuthorC {
    @Id
    int id;
    String firstName;
    String lastName;
    int age;
    Date dateOfBirth;
    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name = "authorId"),
            inverseJoinColumns = @JoinColumn(name = "bookId"))
    List<BookC> bookCList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<BookC> getBookCList() {
        return bookCList;
    }

    public void setBookCList(List<BookC> bookCList) {
        this.bookCList = bookCList;
    }

    @Override
    public String toString() {
        return "AuthorC{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", bookCList=" + bookCList +
                '}';
    }
}
