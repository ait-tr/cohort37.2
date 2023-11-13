/*

Написать программу которая спрашивает сколько сейчас градусов на улице,
и если меньше 3, тогда выводит на экран надпись "вы не можете ехать на летней резине",
иначе выводит надпись "можно ехать"

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                           //создаем сканер, для ввода данных с клавиатуры
                                                                            // System.in - системный поток ввода

        int temperatureLimit = 3;                                           //объявили переменную для хранения лимита по температуре

        System.out.println("Please insert the temperature outside: ");      //просим пользователя ввести реальную температуру

        int temperature = scanner.nextInt();                                //сохраняем ее в переменной temperature


/// ------------------------------------------------------------------------------------------------------------

        //boolean isTemperatureLow = temperature<temperatureLimit;            //переменная isTemperatureLow имеет значение true, если реальная температура меньше лимита

        if (temperature<temperatureLimit) {      // если температура низкая
            System.out.println("It seems like it's too cold outside and you can't drive on summer tires.");
        } else {                    // если температура не низкая
            System.out.println("The temperature outside is nice today. Please drive safe!");
        }

    }
}