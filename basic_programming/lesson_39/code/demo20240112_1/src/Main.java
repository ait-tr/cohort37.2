import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,4,6,7,2,6,0,-1));
        System.out.println(list);
        list.add(3);
        System.out.println(list);

        List<String> listStr = new ArrayList<>(Arrays.asList("tty","qwe","hhhha"));
        System.out.println(listStr);
        listStr.add("ertyu");
        System.out.println(listStr);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(listStr);
        System.out.println(listStr);


        ArrayList<Person> people = new ArrayList<>(List.of(
                new Person("Jack", 10,178.5),
                new Person("Jack", 5,125.3),
                new Person("Pavel", 16, 178.8),
                new Person("Jack", 22,177.3),
                new Person("Svetlana", 21,177.9),
                new Person("Pavel", 3,110.4)
        ));

        Collections.sort(people, new ComparatorPersonByHeight());
        System.out.println(people);


    }
}