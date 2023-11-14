import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int num1= scanner.nextInt();

        System.out.println("Введите 2 число: ");
        int num2= scanner.nextInt();

        System.out.println("Введите 3 число: ");
        int num3= scanner.nextInt();


        int max = num1;
        if (max<num2) {
            max = num2;
        }
        if (max<num3){
            max =num3;
        }

        System.out.println("num1= " +num1 + " num2= " + num2 + " num3= " + num3);
        System.out.println(max + " -самое большое");


    }


}
