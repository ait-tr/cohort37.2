public class Electronic extends Item{
    private String title;
    private String brand;
    private double price;

    private Warranty warranty;

    public Electronic(String title, String brand, double price) {
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.warranty = null;
    }

    public void setWarranty(Warranty warranty) {
        if (this.warranty==null) {
            this.warranty = warranty;
        }
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", warranty=" + warranty +
                '}';
    }

    @Override
    public double buy() {
        this.setWarranty(new Warranty(10, 1));
        System.out.println("Покупка электроника: " + title + " " + warranty  );
        return price + warranty.buy();
    }
}
