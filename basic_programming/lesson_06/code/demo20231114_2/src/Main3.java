import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a number2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter a number3: ");
        int num3 = scanner.nextInt();

        int max = Math.max(num1, num2);
        max = Math.max(max, num3);
        System.out.println(max);
    }
}
