
public class Main {
    public static void main(String[] args) {
        int day1=11;
        int month1=11;
        int year1=2000;

        int day2=10;
        int month2=11;
        int year2=2001;

        printComparingDates(day1,month1,year1,day2,month2,year2);

    }

    public static void printComparingDates(int day1, int month1, int year1, int day2, int month2, int year2){
        int result = compareDates1(day1,month1,year1,day2,month2,year2);

        if (result==0){
            System.out.println("датa1:" + dateToString(day1, month1,year1)  + " дата2:" + dateToString(day2, month2,year2) +  " равны");
        } else {
            System.out.print("датa1:" + dateToString(day1, month1,year1)  + " дата2:" + dateToString(day2, month2,year2));
            System.out.println(result>0? " дата1 позже": " дата2 позже");
        }

    }
    public static String dateToString(int day, int month, int year){
        return day+"-" +month+"-"+year;
    }

 /*
 0 - доты равны
 >0 - date1 позже date2
 <0 - date2 позже date1
  */
public static int compareDates(int day1, int month1, int year1, int day2, int month2, int year2){
    if(year1!=year2){
        return year1-year2;
    } else if (month1!=month2) {
        return month1-month2;
    } else return day1-day2;
}


    public static int compareDates1(int day1, int month1, int year1, int day2, int month2, int year2){
        int date1= 10000*year1+100*month1+day1;  //11.11.2000
        int date2= 10000*year2+100*month2+day2;  //10.11.2001

        return date1-date2;
}


}