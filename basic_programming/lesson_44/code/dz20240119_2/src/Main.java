/*
Дан лист <Person>. Необходимо написать метод, который возвращает List<String> который содержит имена всех пользователей старше 20 лет

Дан List<Person>. Необходимо написать метод, который вернет, сколько раз заданный Person встречается в данном листе.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>(List.of(
                new Person("Jack", 10),
                new Person("John", 42),
                new Person("Lena", 28),
                new Person("Lena", 22),
                new Person("Gena", 12),
                new Person("Denis", 26),
                new Person("Lena", 22),
                new Person("Artem", 14)
        ));

        System.out.println(people);
        System.out.println(getNameList(people, new PersonFilterByAge(10)));
        System.out.println(getNameList(people, new PersonFilterByName("Lena")));
        System.out.println(count(people, new Person("Lena", 22)));

    }

    public static List<String> getNameList(List<Person> people, Predicate<Person> filter){
        List<String> result = new ArrayList<>(people.size());
        for (Person person: people){
            if(filter.test(person)) {
                result.add(person.getName());
            }
        }
        return result;
    }

    public static int count(List<Person> people, Person person){
        int result=0;

        for (Person p: people){
            if(p.equals(person)){
                result++;
            }
        }

        return result;
    }

}
class PersonFilterByAge implements Predicate<Person>{
    private  int ageLimit;

    public PersonFilterByAge(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public boolean test(Person person) {
        return person.getAge()> ageLimit;
    }

}

class PersonFilterByName implements Predicate<Person>{
    private String name;

    public PersonFilterByName(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Person person) {
        return person.getName().equals(name);
    }
}