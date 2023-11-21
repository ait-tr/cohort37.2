/*
Реализовать метод, который выводит на экран числа от 10 до 1 в обратном порядке.

 */
public class Main {
    public static void main(String[] args) {
        int num1=13;
        int num2=10;

        printNumbersWhile(num1,num2);
        printNumbersDoWhile(num1,num2);
        printNumbersFor(num1,num2);

    }

    public static void printNumbersWhile(int num1, int num2) {
        System.out.println("-------------- while ---------------");

        int currentNumber = num1;               // начальные условия, "перед циклом"

        while (currentNumber >= num2) {       // условие, ПОКА цикл выполняется

            System.out.println(currentNumber);

            currentNumber = currentNumber - 1;    // изменение управляющей переменной


        }
        System.out.println("-------------- while  finish ---------------");
        System.out.println("после цикла currentNumber = " + currentNumber);
        System.out.println();
    }

    public static void printNumbersDoWhile(int num1, int num2) {
        System.out.println("-------------- do..while ---------------");

        int currentNumber = num1;               // начальные условия, "перед циклом"

        do {       // начинаем выполнять тело цикла

            System.out.println(currentNumber);

            currentNumber = currentNumber - 1;    // изменение управляющей переменной


        } while (currentNumber >= num2);   // условие, ПОКА цикл выполняется

        System.out.println("-------------- do...while  finish ---------------");
        System.out.println("после цикла currentNumber = " + currentNumber);
        System.out.println();
    }

    public static void printNumbersFor(int num1, int num2) {
        System.out.println("-------------- for ---------------");

        // for (  начальные_условия ;  условие  ; изменение_переменной ){
        // for (int i=0; i<size; i++){
        int currentNumber;
        for (currentNumber = num1; currentNumber >= num2; currentNumber--)  {
            System.out.println(currentNumber);
        }

        System.out.println("-------------- for  finish ---------------");
        System.out.println("после цикла currentNumber = " + currentNumber);
        System.out.println();
    }


}