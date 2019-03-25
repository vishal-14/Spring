package demo.question14To17;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookD {
    @Id
    int id;
    String bookName;
    @ManyToOne
    AuthorD authorD;

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

    public AuthorD getAuthorD() {
        return authorD;
    }

    public void setAuthorD(AuthorD authorD) {
        this.authorD = authorD;
    }

    @Override
    public String toString() {
        return "BookC{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
