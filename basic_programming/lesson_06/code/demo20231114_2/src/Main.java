public class Main {
    public static void main(String[] args) {
       int a = 12;
       int b = 6;

        /*
        10 / 5 = 2
        11 / 5 = 2.2    10 .... 15

        13 / 10      10+3
        21/5    1
        33/5    3
        14/2    0
        15/1    1
         */


        System.out.println("a/b = " + a/b);
        System.out.println("a % b = " + a % b);

        /// ------ определение четности числа
        if( a % 2 == 0){
            System.out.println("четное");
        } else {
            System.out.println("не четное");
        }

        /// ------ определение "круглых" числа

        if( a % 10 == 0){
            System.out.println("да");
        } else {
            System.out.println("нет");
        }

        /*
        Написать программу, которая определяет максимальное из 3х введенных чисел
         */

    }
}