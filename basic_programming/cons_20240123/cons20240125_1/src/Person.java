import java.util.Comparator;

public class Person {
    private String name;
    private MyDate birthday;


    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Comparator<Person> getComparator(){
        return new InnerComparatorPerson();
    }





    class InnerComparatorPerson implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.name.compareTo(o2.name);
        }
    }


}
class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {  this.day = day;  this.month = month; this.year = year;}

    public String toString() { return day + "/" + month +  "/" + year ;}
}
