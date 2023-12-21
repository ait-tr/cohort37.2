public class Clothes extends Item{
    private String title;
    private double price;

    public Clothes(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double buy() {
        System.out.println("Покупка одежда: " + title  + " цена: " + price  );
        return price;
    }
}
