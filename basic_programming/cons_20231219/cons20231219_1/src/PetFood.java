public class PetFood {
    private String title;
    private double price;

    public PetFood(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "PetFood{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
