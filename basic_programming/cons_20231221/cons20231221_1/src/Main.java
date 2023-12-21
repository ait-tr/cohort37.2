public class Main {
    public static void main(String[] args) {
        Purchase p1 = new Purchase(2, new Electronic("TV","Sony",1000.0));
        p1.buy();

        Purchase p2 = new Purchase(3, new Food("Bear", "Drink",0.85, "bochka"));
        p2.buy();

        Electronic tv= new Electronic("TV","Lg",880.0);
        tv.setWarranty(new Warranty(50,10));
        Purchase p3 = new Purchase(1, tv);
        p3.buy();

    }
}