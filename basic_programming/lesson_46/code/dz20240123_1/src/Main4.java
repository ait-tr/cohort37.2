/*
Дан список пользователей. Необходимо написать метод, который вернет Set из пользователей, которые в данном списке встречаются более одного раза
 */

import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Jack",10),
                new Person("Lena",17),
                new Person("Nina",13),
                new Person("Jack",10),
                new Person("John",10),
                new Person("Lena",17)
        );
        System.out.println(getDuplicate3(person));
    }

    public static Set<Person> getDuplicate(List<Person> list){
        Set<Person> set = new HashSet<>();
        Set<Person> result = new HashSet<>();

        for(Person p: list){
            if(set.contains(p)){
                result.add(p);
            } else {
                set.add(p);
            }
        }
        return result;
    }

    public static Set<Person> getDuplicate2(List<Person> list){
        Set<Person> set = new HashSet<>();
        Set<Person> result = new HashSet<>();

        for(Person p: list){
            if(!set.add(p)){
                result.add(p);
            }
        }
        return result;
    }

    public static Set<Person> getDuplicate3(List<Person> list){
        ArrayList<Person> sortedList = new ArrayList<>(list);
        sortedList.sort(new ComparatorByName().thenComparing(new ComparatorByAge()));
        Set<Person> result = new HashSet<>();

        for(int i=1; i<sortedList.size();i++){
            Person element = sortedList.get(i);
            if(sortedList.get(i-1).equals(element)){
                result.add(element);
            }
        }
        return result;
    }
}
