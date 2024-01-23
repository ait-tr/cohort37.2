import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Дан лист Person. Необходимо определить, есть ли в данном листе повторяющиеся объекты.

 */
public class Main1 {
    public static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Jack",10),
                new Person("Lena",17),
                new Person("Nina",13),
                new Person("Jack",10),
                new Person("John",10),
                new Person("Lena",17)
        );
        System.out.println(person);
        System.out.println(isDuplicate(person)?"есть дубликаты":"нет дублей");
    }

    public static boolean isDuplicate(List<Person> people){
        Set<Person> peopleSet = new HashSet<>(people);
        return peopleSet.size()!=people.size();
    }
}