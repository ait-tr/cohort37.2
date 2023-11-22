import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printNumbers2();
    }
    public static  void printNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number=0;
        do {
            System.out.println("Input int number to add or 0 for exit:");
            number = scanner.nextInt();

            int counter=0;
            while (counter<=number){
                System.out.println("          " + counter);
                counter=counter+1;
            }


        } while (number!=0);
    }


    public static  void printNumbers2(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input int number to add or 0 for exit:");
            number = scanner.nextInt();
            printAllNumbersSmallerThenNumber(number);
        } while (number!=0);
    }
    public static void printAllNumbersSmallerThenNumber(int number){
        int counter=0;
        while (counter<=number){
            System.out.println("          " + counter);
            counter=counter+1;
        }
    }



}






 /* пока введенное число не равно 0:
         - вывести сообщение
         - считать число со сканнера
             распечатать каждое число от 0 до введенного числа для чего:
                -  counter 0
                - пока counter меньше введенного числа
                    - вывести значение counter
                    - увеличить counter
  */

