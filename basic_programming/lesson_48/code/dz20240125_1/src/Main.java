/*
Дан List<Person>. Каждый Person имеет имя и возраст. Написать метод,
который сформирует Map<Person,String>, где ключ это Person, значение Имя
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
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

        Map<Person, String> map = listToPersonNameMap(list);
        System.out.println(map);
        String value = map.get(new Person("Bill", 30));
        System.out.println(value);
    }

    public static Map<Person, String> listToPersonNameMap(List<Person> list){

        Map<Person,String> result = new HashMap<>();
        if(list==null){
            return result;
        }
        for(Person p: list){
            result.put(p, p.getName());
        }

        return result;
    }
}
