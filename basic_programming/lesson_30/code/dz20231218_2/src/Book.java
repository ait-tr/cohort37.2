public class Book {
    private String title;
    private String author;
    private String genre;
    private double price;
    private double discount;
    private double discountValue;
    private double newPrice;

    public Book(String title, String author, String genre, double price, double discount) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.discount = discount;
    }

    public void printAuthor(){
        System.out.println("Author: "+getAuthor());
    }
    public void printTitle(){
        System.out.println("Title: "+getTitle());
    }
    public void printGenre(){
        System.out.println("Genre: "+getGenre());
    }
    public void printDiscount(){
        System.out.println("SALE: "+getDiscount()+"%" );
    }
    public void printNewPrice() {
        System.out.println("New Price: " + getNewPrice()+" Euro");
    }



    public void bookPrice(){
        System.out.println("Price: "+ price + " Euro" );
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public double getPrice() {
        return price;
    }
    public double getDiscount() {
        return discount;
    }
    public double getDiscountValue() {
        return discountValue=price*discount%100;
    }
    public double getNewPrice() {
        return newPrice=price-discount;
    }
}
