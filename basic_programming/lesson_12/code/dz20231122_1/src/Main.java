/*
Реализовать метод (точнее три метода, используя while, do..while, for), который выводит на экран четные числа начиная от number1 до number2. Например:
number1 = 10
number2 = 15
Вывод:
~~~~console
10
12
14
~~~~

*/

public class Main {
    public static void main(String[] args) {
        int number1=13;
        int number2=17;
        printEvenNumbersFor(number1,number2);
    }

    // ------------------------   WHILE ------------------------------

    public static void printEvenNumbersWhile(int number1, int number2){
        int currentNumber=number1;
        while (currentNumber<=number2){
            if (currentNumber%2==0){
                System.out.println(currentNumber);
            }
            currentNumber++; // currentNumber=currentNumber+1
        }
    }

    public static void printEvenNumbersWhile2(int number1, int number2){

        int currentNumber = number1;
        if (currentNumber%2!=0){
            currentNumber++;
        }
        while (currentNumber<=number2){
            System.out.println(currentNumber);
            currentNumber+=2;    //currentNumber=currentNumber+2;
        }

    }

    // ------------------------   FOR ------------------------------

    public static void printEvenNumbersFor(int number1, int number2){
        int currentNumber;
        for(currentNumber=number1; currentNumber<=number2; currentNumber++){
            if (currentNumber%2==0) {
                System.out.println(currentNumber);
            }
        }
    }

    public static void printEvenNumbersFor2(int number1, int number2){
        int currentNumber=number1;
        if (currentNumber%2!=0){
            currentNumber++;
        }
        for( ; currentNumber<=number2;  currentNumber+=2){
            System.out.println(currentNumber);
        }
    }

    //-------------------------- do-while ----------

    public static void printEvenNumbersDoWhile(int number1, int number2){
        int currentNumber=number1;
        do {
            if (currentNumber%2==0){
                System.out.println(currentNumber);
            }
            currentNumber++; // currentNumber=currentNumber+1
        }while (currentNumber<=number2);
    }

    public static void printEvenNumbersDoWhile2(int number1, int number2){
        int currentNumber = number1;                  //11        //11
        if (currentNumber%2!=0){
            currentNumber++;
        }                                            //12        //11
        if (currentNumber<=number2) {
            do {
                System.out.println(currentNumber);
                currentNumber += 2; // currentNumber=currentNumber+2
            } while (currentNumber <= number2);
        }
    }


     /*
        Вырожденный FOR

    // for (int i=3;i<10;i++)

    int i=3;
    for(; ; ){

        //тело цикла
        if (i<10){
            // выйти из цикла
            break;
        }
        i++;
    }
    */

}