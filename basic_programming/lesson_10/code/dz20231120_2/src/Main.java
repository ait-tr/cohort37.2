/*
Пользователь вашей программы вводит три int: день, месяц и год.
Ваша программа должна получить м вывести на экран дату следующую за той, что ввел пользователь.
Например:
ввели 31.12.2000 следующая дате 1.1.2001
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = readIntFromScanner("Input day:");
        int month = readIntFromScanner("Input month:");
        int year = readIntFromScanner("Input year:");



        printDate(day, month,year);
        System.out.println("Next date is: ");
        printNextDate(day,month,year);

    }

    public static void printNextDate (int day, int month, int year){

        if (month==12 && day ==31) {   // 31 December
            year = year+1;
            day =1;
            month=1;
        } else if ( day+1> dayInMonth(month, year) ){ // new month
            month=month+1;
            day=1;
        } else {
            day=day+1;
        }

        printDate(day,month,year);
    }
    public static  int dayInMonth(int month, int year){
        //return  31;
        int days=31;
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11: days=30; break;
            case 2: if (isYearLeap(year)){
                days=29;
            } else {
                days=28;
            }
        }
        return days;
    }

    private static boolean isYearLeap(int year) {
       return (year%4 == 0 && year%100 != 0) || (year%400 == 0 );
    }

    public static int readIntFromScanner(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        int value = scanner.nextInt();
        return value;
    }
    public static void printDate(int day, int month, int year){
        System.out.println(day+"-"+month+"-"+year);
    }
}