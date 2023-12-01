public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year ){  // конструктор
        this.day=day;
        this.month=month;
        this.year=year;
    }

    // убираем static
    // убираем параметр
    public  String toString(){
        return this.day+"-"+ this.month+"-"+ this.year;
    }

}
