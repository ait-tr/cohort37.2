/*

Напишите программу, которая просит пользователя ввести 2 целых числа.
Первое означает ограничение скорости,
второе - скорость с которой ехал автомобиль.
Если реальная скорость превышает лимит более чем на 10 километров,
программа должна выводить фразу "вы превысили скорость на …. километров. Оплатите штраф.
Если скорость не превышена, или превышение менее 10 километров - "нарушение отсутствует"

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                                   //создаем сканер, для ввода данных с клавиатуры
        System.out.println("Please insert the speed limit in your area: ");
        int speedLimit = scanner.nextInt();                                         //speedLimit - ограничение скорости
        System.out.println("Please insert the speed you were driving at: ");
        int speedOfUser = scanner.nextInt();                                        //speedOfUser - реальная скорость
        int coefficientOfSpeed = 10;                                                //coefficientOfSpeed - допустимая разница
//---------------------------------------------------------------------------------------------

        boolean isOverSpeed = speedOfUser > speedLimit+coefficientOfSpeed;          //условие необходимости штрафа
        if (isOverSpeed) {     // если штраф
            System.out.println("You have exceeded the speed limit by " + (speedOfUser-speedLimit) + " km/h! Please proceed with paying the fine.");
        } else { // если нет штрафы
            System.out.println("There were no speed violations.");
        }
    }
}