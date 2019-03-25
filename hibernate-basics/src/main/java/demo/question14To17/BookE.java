package demo.question14To17;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookE {
    @Id
    int id;
    String bookName;

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

    @Override
    public String toString() {
        return "BookE{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
