import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return title + " (" +
                "authors=" + authors +
                ")";
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
