/*Реализовать программу естественно, используя switch...case,
которая запрашивает у пользователя цифру от 0 до 9 и выводить на экран ее текстом
Например:
1 -> "one"
2 -> "five"
...*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 0-9: ");
        int num = scanner.nextInt();

        String name = "";

        switch (num) {
            case 1:
                name = "One";
                break;
            case 2:
                name = "Two";
                break;
            case 3:
                name = "Three";
                break;
            case 4:
                name = "Four";
                break;
            case 5:
                name = "Five";
                break;
            case 6:
                name = "Six";
                break;
            case 7:
                name = "Seven";
                break;
            case 8:
                name = "Eight";
                break;
            case 9:
                name = "Nine";
                break;
            case 0:
                name = "Zero";
                break;
        }


        if (name == "") {
            System.out.println("OverTheLimit");
        } else {
            System.out.println(name);
        }
    }
}


/*
 switch (numberOfUser){
            case "1" : numberOfUser= "one"; break;
            case "2" : numberOfUser= "two"; break;
            case "3" : numberOfUser= "three"; break;
            case "4" : numberOfUser= "four"; break;
            case "5" : numberOfUser= "five"; break;
            case "6" : numberOfUser= "six"; break;
            case "7" : numberOfUser= "seven"; break;
            case "8" : numberOfUser= "eight"; break;
            case "9" : numberOfUser= "nine"; break;
            default: numberOfUser= "zero"; break;
        }

 */
