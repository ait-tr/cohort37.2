import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = calcSum();
        System.out.println("the result is " + sum);
    }


    /* пока введенное число не равно 0:
         - вывести сообщение
         - считать число со сканнера
         - к переменной sum прибавить введенное число
     */
    public static int calcSum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.println("The sum is: "+sum + "  Input int number to add or 0 for exit:");
            number = scanner.nextInt();
            sum = sum + number;
        } while (number!=0);
        return sum;
    }

}