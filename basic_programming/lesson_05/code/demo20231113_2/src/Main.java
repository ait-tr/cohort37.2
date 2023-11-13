import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input month number: ");
        int month = scanner.nextInt();

        if( month<=12 && month>=1 ){  /// 1<= month <=12
            System.out.println("month is correct");
        } else {
            System.out.println("month is NOT correct");
        }

    }
}