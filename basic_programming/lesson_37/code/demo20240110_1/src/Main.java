
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1= new Person("John",10);
        Person p2= new Person("Jack",16);
        Person p3= new Person("Sergey",8);
        Person p4= new Person("Nick",11);
        Person p5= new Person("Lena",5);
        Person p6= new Person("Svetlana",15);

        List<String> listOfString = new LinkedList<>();

        List<Person> people = new LinkedList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        //System.out.println(people);

        // перебрать все элементы
        for (Person p: people){
            System.out.println(p);
        }

        people.remove(1);
        System.out.println(people);


        System.out.println(people.get(0));

        // перебрать все элементы
        for (int i = 0; i <people.size() ; i++) {
            System.out.println(people.get(i));
        }

    }



    public static void printList(List<String> list){
        System.out.println(list);
    }

}