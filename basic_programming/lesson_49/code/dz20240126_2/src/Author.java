import java.util.Objects;

public class Author {
    public String fName;
    public String lName;

    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return fName + " " +  lName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (!Objects.equals(fName, author.fName)) return false;
        return Objects.equals(lName, author.lName);
    }

    @Override
    public int hashCode() {
        int result = fName != null ? fName.hashCode() : 0;
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        return result;
    }
}
