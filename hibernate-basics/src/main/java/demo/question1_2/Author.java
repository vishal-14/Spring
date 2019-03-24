package demo.question1_2;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Question 1
 * Create a class Author with instance variables firstName, lastName and age.
 * */
@Entity
public class Author {

    public String firstName;
    @Id
    public String lastName;
    public int age;


    public Author() {
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

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
