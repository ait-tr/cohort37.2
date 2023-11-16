/*
Реализовать программу естественно, используя switch...case, которая запрашивает у пользователя
номер месяца (int), а выводит количество дней в этом месяце.
*Подсказка*: определение високосности года (o! у пользователя нужно узнать и год )
у вас уже реалтзовано.

 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input month: ");
        int month = scanner.nextInt();

        int year=0;
        if (month==2) {
            System.out.println("Input year: ");
            year = scanner.nextInt();
        }

        int daysInMonth=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 8:
            case 7:
            case 10:
            case 12: daysInMonth = 31; break;
            case 4:
            case 6:
            case 9:
            case 11: daysInMonth =30; break;
            case 2:
                boolean isYearLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400==0);
                if (isYearLeap){
                    daysInMonth=29;
                } else {
                    daysInMonth=28;
                };
                break;
        }


        if(month==2){
            System.out.println("month:" +month + " year:"+year + " days in month: " + daysInMonth);
        } else {
            System.out.println("month:" +month +  " days in month: " + daysInMonth);
        }

    }
}