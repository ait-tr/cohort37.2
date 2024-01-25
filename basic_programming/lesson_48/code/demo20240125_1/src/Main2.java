import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(10,"a");
        map1.put(-20,"b");
        map1.put(-67,"b");
        map1.put(5,"c");
        map1.put(11,"d");

        System.out.println(map1);

        System.out.println("------------------------------------");
        Person p1 = new Person("Jack", 32);
        Person p2 = new Person("Lena", 27);

        Map<Person,String> map2 = new TreeMap<>((o1,o2)->o1.getAge()- o2.getAge());
        map2.put(p1, "Jack");
        map2.put(p2, "Lena");
        System.out.println(map2);

        TreeSet<Person> set = new TreeSet<>((o1,o2) -> o1.getName().compareTo(o2.getName()));


        Set<Map.Entry<Integer, String>> entries = map1.entrySet();
        for (Map.Entry<Integer, String> entry: entries){
            System.out.println("key: " + entry.getKey() + "   value = " + entry.getValue() );
            if(entry.getKey()>10) {
                entry.setValue("aaa");
            }
        }
        System.out.println(map1);


    }
}
