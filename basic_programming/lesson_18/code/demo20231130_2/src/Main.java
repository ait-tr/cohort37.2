import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyDate date1 = new MyDate();
        date1.day=11;
        date1.month=11;
        date1.year=2000;

        MyDate date2 = new MyDate();
        date2.day=10;
        date2.month=11;
        date2.year=2001;


        System.out.println(dateToString(date1));
        System.out.println(dateToString(date2));

        MyDate date3=getDateFromScanner();
        System.out.println(dateToString(date3));

    }
    public static String dateToString(MyDate date){
        return date.day + "-" + date.month + "-" + date.year;
    }

    public static MyDate getDateFromScanner(){
        Scanner scanner = new Scanner(System.in);
        MyDate date = new MyDate();

        System.out.println("Введите день: " );
        date.day=scanner.nextInt();

        System.out.println("Введите месяц: " );
        date.month=scanner.nextInt();

        System.out.println("Введите год: " );
        date.year=scanner.nextInt();

        return date;
    }


    /*
    public static void printComparingDates(int day1, int month1, int year1, int day2, int month2, int year2){
        int result = compareDates1(day1,month1,year1,day2,month2,year2);

        if (result==0){
            System.out.println("датa1:" + dateToString(day1, month1,year1)  + " дата2:" + dateToString(day2, month2,year2) +  " равны");
        } else {
            System.out.print("датa1:" + dateToString(day1, month1,year1)  + " дата2:" + dateToString(day2, month2,year2));
            System.out.println(result>0? " дата1 позже": " дата2 позже");
        }

    }





    public static int compareDates1(int day1, int month1, int year1, int day2, int month2, int year2){
        int date1= 10000*year1+100*month1+day1;  //11.11.2000
        int date2= 10000*year2+100*month2+day2;  //10.11.2001

        return date1-date2;
    }


     */

}