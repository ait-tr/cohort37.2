import java.util.*;

public class Main {
    public static void main(String[] args) {


       Person p1 = new Person("Jack", 32);
       Person p2 = new Person("Lena", 27);

        Map<Person,String> map = new HashMap<>();
        map.put(p1, "Jack");
        map.put(p2, "Lena");
        System.out.println(p1.hashCode());

        p1.setAge(33);
        System.out.println(p1.hashCode());
        System.out.println(map);
        System.out.println(p1 + " есть в Map : " + map.containsKey(p1));

    }
}