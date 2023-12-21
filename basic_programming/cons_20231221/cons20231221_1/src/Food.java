public class Food extends Item{
    private String title;
    private  String typeOfFood;

    private double price;
    private String measure;

    private final double DELIVERY_PRICE = 4.50;

    public Food(String title, String typeOfFood, double price, String measure) {
        this.title = title;
        this.typeOfFood = typeOfFood;
        this.price = price;
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "Food{" +
                "title='" + title + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", price=" + price +
                ", measure='" + measure + '\'' +
                '}';
    }

    @Override
    public double buy() {
        System.out.println("Покупка еда: " + title + "1 " + measure + " цена: " + price  );
        return price + DELIVERY_PRICE;
    }
}
