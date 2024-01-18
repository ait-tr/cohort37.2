import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jack",32));
        personList.add(new Person("John",30));
        personList.add(new Person("Vlad",36));
        personList.add(new Person("John",30));
        personList.add(new Person("Jack",32));
        personList.add(new Person("Lena",21));
        System.out.println("Исходный лист:");
        System.out.println(personList);

        Person person1 = new Person("Jack",32);
        Person person2 = new Person("Pavel",34);
        replace2(personList,person1,person2);
        System.out.println("Результат:");
        System.out.println(personList);
    }

    public static void replace(List<Person> list, Person person1, Person person2){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(person1)){
                list.set(i,person2);
            }
        }
    }

    public static void replace2(List<Person> list, Person person1, Person person2){
       int index;
        while ( (index = list.indexOf(person1)) != -1){
            list.set(index,person2);
        }
    }


}

/*
1. создать Person (конструктор, toString, equals&hashCode )
2. создать лист из Person
3. Создать метод replace(List, Person 1, Person 2)
    4. перебрать лист (for i
    5 если Person из листа равен Person 1 то  list.set(текущий индекс, Person 2)


 */