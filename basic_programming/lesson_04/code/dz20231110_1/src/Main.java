/*
Написать программу которая в качестве данных имеет диаметр пиццы. Необходимо,
что бы ваша программа расчтывала площадь пиццы (вспомтнаем плщадь круга)
Определите с помощью вашей программы, что  выгоднее покупать:
одну большую пиццу (48 сm) - 15 евро или 2 средних пицци (22 см) -7 евро.

 */

public class Main {
    public static void main(String[] args) {
        // ----- data ----------
        int pizzaDiameter1 = 48;
        int pizzaDiameter2 = 22;
        int pizzaPrice1 = 15;
        int pizzaPrice2 = 7;

        double pi = 3.1415;

        // ---------- payload ----------
        double pizzaRadius1 = pizzaDiameter1*0.5;
        double pizzaRadius2 = pizzaDiameter2*0.5;
        double pizzaSquare1 = pi*pizzaRadius1*pizzaRadius1;
        double pizzaSquare2 = pi*pizzaRadius2*pizzaRadius2;
        double pizzaAbsolutePrice1 =pizzaPrice1/pizzaSquare1;
        double pizzaAbsolutePrice2 =pizzaPrice2/pizzaSquare2;

        // ---------- output ----------

        System.out.println("---------- Пицца 1 ---------- ");
        System.out.println("Диаметр: " + pizzaDiameter1 + "см. Площадь:" +pizzaSquare1);
        System.out.println("Цена : " + pizzaPrice1 + "евро");
        System.out.println("Цена квадратного сантиметра составляет: " + pizzaAbsolutePrice1);

        System.out.println("---------- Пицца 2 ---------- ");
        System.out.println("Диаметр: " + pizzaDiameter2 + "см. Площадь:"+pizzaSquare2);
        System.out.println("Цена : " + pizzaPrice2 + "евро");
        System.out.println("Цена квадратного сантиметра составляет: " + pizzaAbsolutePrice2);


    }
}