/*
Допустим мы пишем программу для начисления штрафов.
Исходные данные программы: ограничение скорости, реальная скорость машины.
Необходимо реализовать следующую таблицу штрафов:
* 1 - 5 км/ч	0 евро   предупреждение
* 6 - 20 км/ч	30 евро
* 21 - 40 км/ч	70 евро
* 41 - 100 км/ч	270 евро
* 100 >  км/ч	1270 евро

Программа должна выводить информацию о штрафе или о его отсутствие



 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ограничение скорости: ");
        int speedLimit = scanner.nextInt();

        System.out.println("Введите скорость: ");
        int speed = scanner.nextInt();

        int limit0 = 1;
        int limit1 = 5;
        int limit2 = 20;
        int limit3 = 40;
        int limit4 = 100;

        int fine0 = 0;
        int fine1 = 30;
        int fine2 = 70;
        int fine3 = 270;
        int fine4 = 1270;

        int overSpeed = speed - speedLimit; // превышение скорости
        // if () {}
        // else if () {}

        if (overSpeed<limit0) {
            System.out.println("нарушений нет!");
        }  else {
            int actualFine=0;
            if (overSpeed > limit0 && overSpeed <= limit1) {
                actualFine=fine0;
                System.out.println("Отделались предупреждением");
            } else if (overSpeed > limit1 && overSpeed <= limit2) {
                actualFine=fine1;
            } else if (overSpeed > limit2 && overSpeed <= limit3) {
                actualFine=fine2;
            } else if (overSpeed > limit3 && overSpeed <= limit4) {
                actualFine=fine3;
            } else if (overSpeed > limit4) {
                actualFine=fine4;
            }
            System.out.println("Превышение: " + overSpeed);
            System.out.println("Штраф: " + actualFine);
        }
    }
}