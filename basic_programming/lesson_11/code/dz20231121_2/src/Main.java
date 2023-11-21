/*
Немного азартных игр. Написать метод, который принимает 3 строки, каждая из которых текстом записанная цифра например так ("one","five","six"). В рамках данной задачи строки всегда корректны и могут быть только:
one,two, three, four, five, six, seven, eight, nine.  Ваш метод должен возвращать int обозначающий выйгрыш:
* 1000 - если комбинация 777,
* 500 - если комбинация, цифры идущие в обратном порядке, например 876 или 765 или 987
* 250 - если комбинация, цифры идущие в прямом порядке, например 678 или 567 или 789
во всех остальных случаях, 0

 */


public class Main {
    public static void main(String[] args) {
        String number1="seven";
        String number2="six";
        String number3="five";
// -----------------------------------------------------------------
        int winnings = calcWinnings(number1, number2, number3);
        System.out.println("winnings is " + winnings);
    }

    public static int calcWinnings(String number1, String number2, String number3) {
        int num1 = stringToInt(number1);
        int num2 = stringToInt(number2);
        int num3 = stringToInt(number3);

        boolean winCondition1 = num1==7 && num2==7 && num3==7; // 1000
        boolean winCondition2 = num2==num1-1 && num3==num2-1;  // 500
        boolean winCondition3 = num2==num1+1 && num3==num2+1;  // 250

        if(winCondition1){
            return 1000;
        } else if (winCondition2) {
            return 500;
        } else if (winCondition3) {
            return 250;
        } else {
            return 0;
        }


    }



    private static int stringToInt(String number) {
        switch (number){
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            default: return 0;
        }
    }


}