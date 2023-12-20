/*
                 Задание

      Сравнение ограничения скорости и реальной скорости автомобиля.
      Вывод на экран результата.

 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner speed = new Scanner(System.in);

        System.out.println(" Speed Limit: ");
        int speedLimit = speed.nextInt();
        System.out.println(" Real Speed: ");
        int realSpeed = speed.nextInt();
        int difference = realSpeed - speedLimit;

        boolean mustSpeed = difference <= 10;

        if (mustSpeed) {
            System.out.println(" скорость не превышает лимит на 10км. Нарушения отсутствуют");
        } else {
            System.out.println(" скорость превышает лимит на 10км. Вы превысили скорость на " + difference + " км. Оплатите штраф!!! ");

        }
    }
}