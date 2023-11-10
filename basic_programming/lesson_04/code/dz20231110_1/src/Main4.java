/*Написать программу которая в качестве данных имеет диаметр пиццы. Необходимо,
что бы ваша программа расчтывала площадь пиццы (вспомтнаем плщадь круга)
Определите с помощью вашей программы,
что выгоднее покупать: одну большую пиццу (48 сm) - 15 евро или 2 средних пицци (22 см) -7 евро.
*/

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input radius of pizza 1: ");
        int pizzaRadius1 = scanner.nextInt();

        System.out.println("Input radius of pizza 2: ");
        int pizzaRadius2 = scanner.nextInt();



        System.out.println("Pizza`s radius= " + pizzaRadius1+"cm");
        
        System.out.println("Pizzas Square= "+3.14 * pizzaRadius1*pizzaRadius1);
        System.out.println("Pizza`s radius= " + pizzaRadius2+"cm");


        double square = 3.14 * pizzaRadius2*pizzaRadius2;
        System.out.println("Pizzas Square= "+ square);
        double twoSmallPizza= square*2;
        System.out.println("Two Small Pizza`s Square=  "+ twoSmallPizza);
    }
}
