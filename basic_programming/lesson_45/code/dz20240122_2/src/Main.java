/*
Дан List<Person>. Ваша задача, написать метод, который удаляет из листа всех Person:
- заданного возраста
- возраста, который больше максимально допустимого и меньше минимально допустимого (например, заданы границы  от 4 до 8, то все чей возраст меньше 4 и больше 8 удаляются из списка)
- с именами, не содержащими заданную подстроку, без учета регистра. Например, если задана подстрока “ол” в списке должны остаться “Оля”, “Коля”, “Николай” а, например, “Сергей” должен быть удален.

Подсказка: вы можете использовать метод removeIf, просто реализуя разные Predicate<Person>


 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        List<Person> list = List.of(
                new Person("Jack", 10),
                new Person("Oleg", 5),
                new Person("Nick", 32),
                new Person("John", 31),
                new Person("Nickolaus", 12),
                new Person("Lera", 20),
                new Person("Vladimir", 10),
                new Person("Sten", 18)
        );
        list = new ArrayList<>(list);
        System.out.println(list);

        //remove(list,Person.getPredicateByAge(10,25));
        remove(list,Person.getPredicateByNameSubstring("J").negate()); // .negate() - возвращает предикат с обратным знаком
        System.out.println(list);

        System.out.println("------------------------- Task 4 ---------------------------");
        List<String> listStr = List.of(
                "Jack,19",
                "Nick,20",
                "lena,19",
                "Sten,16"
        );
        System.out.println(listStr);
        System.out.println(createList(listStr));



    }

    public static void remove(List<Person> list, Predicate<Person> predicate) {
        list.removeIf(predicate);
    }
    public static List<Person> createList(List<String> listStr){
        List<Person> result = new ArrayList<>();
        for(String str: listStr){
            result.add(new Person(str));
        }
        return result;
    }

}



