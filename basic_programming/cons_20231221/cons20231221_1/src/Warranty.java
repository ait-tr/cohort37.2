public class Warranty extends Item{
    private double price;
    private  int duration;


    public Warranty(double price, int duration) {
        this.price = price;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Warranty{" +
                "price=" + price +
                ", duration=" + duration +
                '}';
    }

    @Override
    public double buy() {
        System.out.println("Покупка гарантии");
        return price;
    }
}
