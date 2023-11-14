import java.util.Scanner;

/*
    Написать программу, которая определяет максимальное из 3х введенных чисел
*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int num1= scanner.nextInt();

        System.out.println("Введите 2 число: ");
        int num2= scanner.nextInt();

        System.out.println("Введите 3 число: ");
        int num3= scanner.nextInt();


        System.out.println("num1= " +num1 + " num2= " + num2 + " num3= " + num3);
        if (num1>=num2 && num1>=num3){
            System.out.println(num1 + " -самое большое");
        } else if (num2>=num1 && num2>=num3){
            System.out.println(num2+ " -самое большое");
        } else if (num3>=num1 && num3>=num2){
            System.out.println(num3+ " -самое большое");
        }
    }
}