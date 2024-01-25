import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Дан List<Person>. Каждый Person имеет имя и возраст. Написать метод который сформирует Map<Integer, List<Person> >, где ключ это возраст, значение список людей этого возраста
 */
public class Main3 {
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

        System.out.println(listToMap(list));

    }

    public static Map<Integer, List<Person>> listToMap(List<Person> list){
        Map<Integer, List<Person>> map = new HashMap<>();
        if(list!=null && !list.isEmpty()){
            for (Person p: list){
                int key = p.getAge();
                List<Person> value = map.getOrDefault(key, new ArrayList<>());
                value.add(p);
                map.put(key,value);
            }
        }
        return map;
    }
}
