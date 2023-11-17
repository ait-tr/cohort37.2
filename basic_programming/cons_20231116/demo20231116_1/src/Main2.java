public class Main2 {
    public static void main(String[] args) {
        int day=31;
        int month =4;
        int year=1997;
        //--------------------------------

        boolean isDateOk = isYearOk(year) && isMonthOk(month) && isDayOk(day, month,year);
        System.out.println(day+":"+month+":"+year);
        System.out.println(isDateOk);
    }
    public static boolean isYearOk(int year){
        return year>0;
    }
    public static boolean isMonthOk(int month){
        return month>=1 && month <=12;
    }
    public static boolean isDayOk(int day, int month,  int year){
        return day>=1 && day <=getDaysInMonth(month,year);
    }

    public  static int getDaysInMonth(int month, int year){
        int result=31;
        switch (month){
            case 1:
            case 3: result=31; break;
            case 6:
            case 11:
            case 4: result=30; break;
        }
        return result;
    }
}
