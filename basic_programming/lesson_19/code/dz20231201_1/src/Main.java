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

        printComparingDates(date1,date3);



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



    public static void printComparingDates(MyDate date1, MyDate date2){
        int result = compareDates1(date1, date2);

        if (result==0){
            System.out.println("датa1:" + dateToString(date1)  + " дата2:" + dateToString(date2) +  " равны");
        } else {
            System.out.print("датa1:" + dateToString(date1)  + " дата2:" + dateToString(date2));
            System.out.println(result>0? " дата1 позже": " дата2 позже");
        }

    }





    public static int compareDates1(MyDate date1, MyDate date2){
        int sumDate1= 10000*date1.year+100*date1.month+date1.day;  //11.11.2000
        int sumDate2= 10000*date2.year+100*date2.month+date2.day;  //10.11.2001

        return sumDate1-sumDate2;
    }




}