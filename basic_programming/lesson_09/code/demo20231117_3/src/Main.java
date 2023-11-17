import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = readIntFromScanner("Input day:");
        int month = readIntFromScanner("Input month:");
        int year = readIntFromScanner("Input year:");

        printDate(day, month,year);

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