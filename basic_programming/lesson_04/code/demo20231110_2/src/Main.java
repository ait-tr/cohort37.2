import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ageLimit = 18;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age: ");
        int ageOfUser = scanner.nextInt();

        boolean isUserAdult = ageOfUser>=ageLimit;

        if ( isUserAdult ) {

            System.out.println("добро пожаловать!");  // будет выполнено, если isUserAdult true

        } else {
             System.out.println("в школу!!!!");  // будет выполнено, если isUserAdult false
        }



        /*

        if (  условие / boolean  ) {
            код, если условие true
        } else {
             код, если условие false
        }

         */



    }
}