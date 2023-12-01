import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyDate date1= new MyDate(1,5,2005);
        MyDate date2= new MyDate(5,10,2015);
        MyDate date3= new MyDate(1,11,2017);
        MyDate date4 = getDateFromScanner();

        //MyDate date4= new MyDate();  Error

        MyDate[] dates = {date1,date2,date3, date4};
        for (MyDate date : dates){      // for(int i=0; i<dates.length; i++) { MyDate date= dates[i];
            System.out.println(date.toString());
        }

        Person person1 = new Person("Jack", "Smith", date1);
        Person person2 = new Person("Lena", "Smith", date2);
        Person person3 = new Person("Egor","Ivanov", date3);

        Person[] people = {person1,person2,person3};
        for (Person person: people){
            System.out.println(person.toString());
        }

    }


    public static MyDate getDateFromScanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день: " );
        int day=scanner.nextInt();

        System.out.println("Введите месяц: " );
        int month=scanner.nextInt();

        System.out.println("Введите год: " );
        int year=scanner.nextInt();

        MyDate date = new MyDate(day,month,year);

        return date;
    }

}