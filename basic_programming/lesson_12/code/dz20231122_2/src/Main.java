/*
Реализовать метод (точнее три метода, используя while, do..while, for), который
считает сумму четных числа начиная от number1 до number2. Например:
number1 = 10
number2 = 15
Вывод:
~~~~console
36
~~~~

 */

public class Main {
    public static void main(String[] args) {
        int number1=1;
        int number2=9;

        int sum = calcSumEvenNumbersWhile(number1, number2);
        System.out.println(sum);
    }

    public static int calcSumEvenNumbersWhile(int number1, int number2) {
        /*
           - перебираем все числа
           - отбираем четные
           - суммируем отобранные четные числа
         */
        int sum = 0;
        int currentNumber = number1;
        while (currentNumber <= number2) {
            if (currentNumber % 2 == 0) {
                sum = sum + currentNumber;
            }
            currentNumber++; // currentNumber=currentNumber+1
        }
        return sum;
    }
}