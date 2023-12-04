public class Library {
    Book[] books;

    public Library(Book[] books){
        this.books = books;
    }

    public String toString(){
        String rezult="";
        for (Book book: books){
                rezult += book + "\n";
        }
        return rezult;
    }


}
