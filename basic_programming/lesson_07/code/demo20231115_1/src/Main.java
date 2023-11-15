import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String monthTitle = scanner.nextLine();
        monthTitle=monthTitle.toLowerCase();


        int monthNumber = 0;


        /*
            monthTitle.equals("январь")     ==
            !monthTitle.equals("январь")    !=
         */
        /*
        switch (управляющая переменная) {
            case значение_1: действие_1; break;
            case значение_2: действие_2; break;
            case значение_3: действие_3; break;
            case значение_4: действие_4; break;
         }
         */

        switch (monthTitle){
            case "январь": monthNumber = 1; break;
            case "февраль": monthNumber = 2; break;
            case "март": monthNumber = 3; break;
            case "апрель": monthNumber = 4; break;
            case "май": monthNumber = 5; break;
            case "июнь": monthNumber = 6; break;
            case "июль": monthNumber = 7;break;
            case "август": monthNumber = 8; break;
            case "сентябрь": monthNumber = 9; break;
            case "октябрь": monthNumber = 10; break;
            case "ноябрь": monthNumber = 11; break;
            case "декабрь": monthNumber = 12; break;
            default: monthNumber = 0; break;
        }

        String season="";
        switch (monthNumber){
            case 12:
            case 1:
            case 2: season ="зима"; break;
            case 3:
            case 4:
            case 5: season ="весна"; break;
            case 6:
            case 7:
            case 8: season ="лето"; break;
            case 9:
            case 10:
            case 11: season ="осень"; break;
            default: season="неопознанный сезон";
        }


        /*

        if (  monthTitle.equals("январь")  ){
            monthNumber = 1;
        } else if (  monthTitle.equals("февраль") ){
            monthNumber = 2;
        } else if (  monthTitle.equals("март") ){
            monthNumber = 3;
        } else if (  monthTitle.equals("апрель") ){
            monthNumber = 4;
        }else if (  monthTitle.equals("май") ){
            monthNumber = 5;
        }else if (  monthTitle.equals("июнь") ){
            monthNumber = 6;
        }else if (  monthTitle.equals("июль") ){
            monthNumber = 7;
        }else if (  monthTitle.equals("август") ){
            monthNumber = 8;
        }else if (  monthTitle.equals("сентябрь") ){
            monthNumber = 9;
        }else if (  monthTitle.equals("октябрь") ){
            monthNumber = 10;
        }else if (  monthTitle.equals("ноябрь") ){
            monthNumber = 11;
        }else if (  monthTitle.equals("декабрь") ){
            monthNumber = 12;
        }

        */
        if(monthNumber==0){
            System.out.println(monthTitle + " - неопознанный месяц");
        } else {
            System.out.println(monthTitle + " - " + monthNumber);
        }
        System.out.println(season);


    }
}