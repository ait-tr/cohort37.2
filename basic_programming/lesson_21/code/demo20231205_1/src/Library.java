public class Library {
    Book[] books;
    int libraryCapacity;
    int size=0;

    public Library(int libraryCapacity){
        this.books = new Book[libraryCapacity];
    }

    public void addBook(Book book){
        if (size<books.length){
            books[size] = book;
            size++;
        }
    }

    public String toString(){
        String rezult="";
        for (Book book: books){
                rezult += book + "\n";
        }
        return rezult;
    }


}
