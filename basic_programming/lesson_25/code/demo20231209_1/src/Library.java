public class Library {
    private Book[] books;
    private int libraryCapacity;
    private int size=0;
    private int defCapacity=5;

    public Library(int libraryCapacity){
        if (libraryCapacity<defCapacity) {
            libraryCapacity=defCapacity;
        }
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
        /*
        for (int i=0; i<size && i<books.length; i++){
            Book book = books[i];
        */
         for (Book book: books){
            if(book==null) {
                break;
            }
           rezult += book + "\n";

        }
        return rezult;
    }

    public int getSize(){
        return size;
    }


}
