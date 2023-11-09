/*
Написать программу аналогично п.1 но имя  и город вводить с клавиатуры
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input city: ");
        String city = scanner.nextLine();

        System.out.println("Мое имя: " + name);
        System.out.println("Я живу в городе " + city);

        /*
        True: CamelCase
            city
            cityOfTheUser

        False:
            c
            abc
            c1
            city_Of_The_User
            city-Of-The-User
            CITYOFTheUser
           cityofftheuser


         */


    }
}