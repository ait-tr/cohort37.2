import java.util.Comparator;

public class ComparatorPersonByAge implements Comparator<Person> {
    /*
        если результат положительный -> o1 больше o2
        если результат отрицательный -> o2 больше o1
        если результат 0 -> o1 равно o2

     */

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge()<o2.getAge()) return  100000;
        if(o1.getAge()>o2.getAge()) return  -100000;
        return  0;
    }
}
