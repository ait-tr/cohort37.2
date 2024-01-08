public class Main {
    public static void main(String[] args) {
       Auto a1 = new Auto(Brand.AUDI, "11-22", Color1.BLACK);
       Auto a2 = new Auto(Brand.OPEL, "11-33", Color1.RED);
       Auto a3 = new Auto(Brand.AUDI, "11-44", Color1.BLACK);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.getColor().getRusTitle());
    }
}