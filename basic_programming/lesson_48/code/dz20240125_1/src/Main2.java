import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Дан List<Person>. Каждый Person имеет имя и возраст. Реализовать несколько Comparator<Person> :
- по имени (по алфавиту),
- по длине имени,
- по возрасту.
Каждый компаратор реализовать используя анонимный класс и используя лямбда-выражение. Проверить, вызывая метод sort

 */
public class Main2 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(
                new Person("Bill", 30),
                new Person("Bill", 30),
                new Person("Jack", 29),
                new Person("Jill", 29),
                new Person("Jill", 27),
                new Person("Jamie", 25),
                new Person("Johnie", 31)
        ));

        // ----------------   Анонимный класс
        Comparator<Person> comparatorByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Person> comparatorByLengthName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().length() - o2.getName().length();
            }
        };

        Comparator<Person> comparatorByAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        System.out.println("comparatorByName");
        sortAndPrintList(list,comparatorByName);

        System.out.println("comparatorByLengthName");
        sortAndPrintList(list,comparatorByLengthName);

        System.out.println("comparatorByAge");
        sortAndPrintList(list,comparatorByAge);

        System.out.println("--------------------------------------------------------");
        System.out.println("comparatorByName");
        sortAndPrintList(list,(Person p1, Person p2) -> p1.getName().compareTo(p2.getName()) );

        System.out.println("comparatorByLengthName");
        sortAndPrintList(list,(Person p1, Person p2) -> p1.getName().length() - p2.getName().length());

        System.out.println("comparatorByAge");
        sortAndPrintList(list,(Person p1, Person p2) -> p1.getAge() - p2.getAge());


    }

    public static void sortAndPrintList(List<Person> list, Comparator<Person> comparator){
        List<Person> copy = new ArrayList<>(list);   // сохранил исходный лист
        copy.sort(comparator);
        copy.forEach((p) -> System.out.println(p));
    }
}
