public class Film {
    private String title;
    private String country;
    private int year;

    public Film(String title, String country, int year) {
        this.title = title;
        this.country = country;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film: \"" + title + "\" (" + year + ")/" + country;
    }
}
