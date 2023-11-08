import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input user name: ");

        Scanner scanner = new Scanner(System.in);

        String nameOfUser = scanner.nextLine();

        System.out.println("The user's name is " + nameOfUser);

    }
}