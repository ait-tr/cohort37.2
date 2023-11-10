import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLimit = 18;
        System.out.println("Input age: ");
        int age = scanner.nextInt();

        boolean isAdult = age >= ageLimit;

        System.out.println("Пользователь взрослый:" + isAdult);


        // boolean demo1 = 19;  // error
        boolean demo2 = 19/3 >= 6; // false    6>6 - > false
        boolean demo3 = isAdult;
        boolean demo4 = 6 == (18/3);
        boolean demo5 = ageLimit == 18; // true сравнение  ageLimit равно 18
        boolean demo6 = ageLimit != 18; // false  сравнение  ageLimit НЕ равно 18

    }
}