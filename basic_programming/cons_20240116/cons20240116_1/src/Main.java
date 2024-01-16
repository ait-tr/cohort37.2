import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(
                new Person("Jack", 16),
                new Person("Lena", 13),
                new Person("Pavel", 21)
        ));

        Collections.sort(list, new ComparatorPersonByAge());     // c.compare()




    }
}