package demo.question14To17;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookC {
    @Id
    int id;
    String bookName;
    @ManyToOne
    AuthorC authorC;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public AuthorC getAuthorC() {
        return authorC;
    }

    public void setAuthorC(AuthorC authorC) {
        this.authorC = authorC;
    }

    @Override
    public String toString() {
        return "BookC{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}