public class Main2 {

    public static void main(String[] args) {


/*Написать программу которая в качестве данных имеет диаметр пиццы.
Необходимо, что бы ваша программа расчтывала площадь пиццы (вспоминаем площадь круга)
 определите с помощью вашей программы, что выгоднее покупать:
 одну большую пиццу (48 сm) - 15 евро или 2 средних пицци (22 см) -7 евро.
 */

        // S= 3,14 * r^2
        // S= 3,14 * (r*r)

        int radius = 50;

        //price1/s1
        //price2/s2

        System.out.println("Пицца "+ radius+" сm");

        double area = 3.14 * (radius * radius);
        System.out.println("площадь круга равна:" + area);


        System.out.println("Пицца диаметр 22cm");
        int kreis = 22;
        double fläche = 3.14 * (22 * 22);
        System.out.println("площадь круга равна" + fläche);

        System.out.println("Обьщая площадь состовляет двух пицц по 22 cm:");
        System.out.println(fläche + fläche);


        System.out.println("Выгоднее купить одну большую пиццу");

    }
}
