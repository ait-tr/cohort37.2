public class MyDate {
   private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month=month;
        this.year=year;
        if (!isDateValid()){ // error!!!
            throw new IllegalArgumentException("Ошибка");
        }
    }

    public String toString(){
        return day+"/"+month+"/"+year;
    }


    public boolean isDateValid(){
        return year>0 && month>=1 && month<=12 && day>=1 && day<=daysInMonth();

    }

    public boolean isLeapYear(){
        return  (year % 4 == 0 && year % 100 != 0) || (year % 400==0);
    }


    public  int daysInMonth(){
        int[] monthDays= {0, 31,28,31,30,31,30,31,31,30,31,30,31};
        int daysInMonth=monthDays[month];
        if (month==2 && isLeapYear() ){
            daysInMonth=29;
        }
        return daysInMonth;
    }

    public void setDay(int day) {
        this.day = day;
        if (!isDateValid()){
            throw new IllegalArgumentException("Ошибка");
        }
    }

    public void setMonth(int month) {
        this.month = month;
        if (!isDateValid()){
            throw new IllegalArgumentException("Ошибка");
        }
    }

    public void setYear(int year) {
        this.year = year;
        if (!isDateValid()){
            throw new IllegalArgumentException("Ошибка");
        }
    }

    public void changeDate(int day, int month, int year){
        this.day = day;
        this.month=month;
        this.year=year;
        if (!isDateValid()){ // error!!!
            throw new IllegalArgumentException("Ошибка");
        }
    }

}
