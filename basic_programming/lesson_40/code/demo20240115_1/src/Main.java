import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("qwe1", "weru2", "hh", "hhhhdhdhdh"));
        Collections.sort(list,new ComparatorStringByNameLength());

        Person p1 = new Person("Jack");
        Person p2 = new Person("Lena");

        ArrayList listPerson = new ArrayList(List.of(
                new Person("Jack"),
                new Person("Pavel"),
                new Person("Nickalay")
        ));
        Collections.sort(listPerson);
        System.out.println(listPerson);


    }
}