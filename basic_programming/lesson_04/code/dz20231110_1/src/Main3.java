public class Main3 {
    public static void main(String[] args) {
        int a= 48;
        int b= 2;
        int c= a/b;
        double areaBigPizza = 3.14 * (c*c);
        System.out.println("Площадь большой пиццы: " + areaBigPizza);

        int a1=22;
        int b1=2;
        int c1=a1/b1;
        double areaSmallPizza = 3.14 * (c1*c1);
        System.out.println("Площадь одной маленькой пиццы: " + areaSmallPizza);

        double twoSmallPizza=areaSmallPizza+areaSmallPizza;
        System.out.println("Площадь двух маленьких пицц: "+twoSmallPizza);

        double bbp= areaBigPizza/twoSmallPizza;
        System.out.println("Большая пицца больше в: "+bbp);

        //Выгоднее покупать одну большую пиццу
    }
}
