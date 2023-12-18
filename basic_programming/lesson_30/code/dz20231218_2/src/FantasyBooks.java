public class FantasyBooks extends Book {
    public FantasyBooks(String title, String author, String genre, double price, double discount){
        super(title,author,genre,price,discount);
    }

    public void printDiscount(){
        System.out.println("Sale: "+getDiscount());
    }

}
