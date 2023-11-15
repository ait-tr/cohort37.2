/*
Реализовать программу, которая запрашивает у пользователя год (int, например 1997) и определяет високосный это год или нет.

**високосный год**:

-   год, номер которого кратен 400, — високосный;
-   остальные годы, номер которых кратен 100, — невисокосные
    (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
-   остальные годы, номер которых кратен 4, — високосные;

все остальные годы — невисокосные.

 */


public class Main {
    /*
            day   month   year
             10    3       1993     T
             -10   3       1999     F
             0     4        2000    F
             32    7       1433     F
             29    2       1999     F
             31    4       2000     F
              7    -1      2000     F
              28    2     1999      T



     */


    public static void main(String[] args) {
        int year = 1900;

        int temp = 044;  // восмиричная
        int temp1 = 0x16; // 16-ричная
        int temp2 = 0b101; // 2-ичная

        System.out.println(temp);
        System.out.println(temp1);
        System.out.println(temp2);

        // ^   &&   ||
        //boolean isLeap =   (    year%4==0 && (year%400==0  ^ year%100!=0)     );   TRUE:  //2000  //1993 // 2020      FALSE:1900,1800
        //boolean isYearLeap =  year%400==0 || (year % 4 == 0 && year % 100 != 0);

        boolean isYearLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400==0);


        if (isYearLeap){
            System.out.println("year is leap");
        } else {
            System.out.println("year is not leap");
        }


    }
}