public class Book {
    int number;
    String title;
    String[] author;
    int year;

    public Book (int number, String title, String author, int year){
        //this.author = new String[1];
        this.number=number;
        this.title=title;
        this.author=author.split(",");
        this.year=year;
    }

    public Book (int number, String title, String[] authors, int year){
        this.number=number;
        this.title=title;
        this.author=authors;
        this.year=year;
    }

    private String authorsToString(){
        return String.join(",", author);

        /*
        String res="";
        for (String a: author){
            res += a+",";
        }
        return res;

         */
    }

    public String toString() {

        return "Книга " + number+ " [Название:'"+ title + '\''+ ", авторы:" + authorsToString() +"; дата публикации:'"+year+'\''+']';
    }



}