package demo.question14To17;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookF {
    @Id
    int id;
    String bookName;
    @ManyToMany(mappedBy = "bookFList")
    List<AuthorF> authorFList = new ArrayList<>();

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

    public List<AuthorF> getAuthor9FList() {
        return authorFList;
    }

    public void setAuthorFList(List<AuthorF> authorFList) {
        this.authorFList = authorFList;
    }

    @Override
    public String toString() {
        return "BookF{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
