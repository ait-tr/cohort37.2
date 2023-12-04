public class Main {
    public static void main(String[] args) {

        /*
        Придумайте и опишите класс, для любой предметной области.
        Например,товар в интернет-магазине или автомобиль для продажи или любой другой.
        В вашем классе должно быть несколько полей. Сделайте конструктор.
        Сделайте toString.
        В main создайте несколько объектов своего класса, положите их в массив и,
        по образу и подобию классной работы выведите на экран.
         */

        Product product1 = new Product("JBL Tune Beam","48h","водонепроницаемые","81,99€");
        Product product2 = new Product("JBL Tune 130 NC TWS","40h","водонепроницаемые","61.04€");
        Product product3 = new Product("JBL Tune Flex TWS","32h","водонепроницаемые","69,99€");

        Product[] products = {product1,product2,product3};

        for (Product product : products){
            System.out.println(product);
        }

        System.out.println("---------------------------------------------------------");

        System.out.println(product1);  //   System.out.println(product1.toString());
        System.out.println(product1.toSmallString());
        String str = "qw" +  product1;
        System.out.println(str);
    }
}