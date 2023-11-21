/*
Реализовать метод, который выводит на экран числа от 10 до 1 в обратном порядке.

 */
public class Main {
    public static void main(String[] args) {
        //printNumbers();
        decrementDemo();
    }

    public static void printNumbers() {

        int currentNumber = 10;               // начальные условия, "перед циклом"

        while (currentNumber >= 1) {       // условие, ПОКА цикл выполняется

            System.out.println(currentNumber);

            currentNumber = currentNumber - 1;    // изменение управляющей переменной


        }
    }

    public static void decrementDemo(){
        int currentNumber = 10;

        while (currentNumber >= 1) {

            System.out.println(currentNumber--);

            // currentNumber--;  //currentNumber = currentNumber - 1;

            //  --    декремент
            //  ++    инкремент

        }
    }


    public  static void operationDemo(){
        int myBestNewVariable = 10;
        myBestNewVariable += 10;   //myBestNewVariable = myBestNewVariable + 10;
        myBestNewVariable -= 10;   //myBestNewVariable = myBestNewVariable - 10;
        myBestNewVariable *= 10;   //myBestNewVariable = myBestNewVariable * 10;
        myBestNewVariable /= 10;   //myBestNewVariable = myBestNewVariable / 10;
        myBestNewVariable %= 10;   //myBestNewVariable = myBestNewVariable % 10;

    }

}