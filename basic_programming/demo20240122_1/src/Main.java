import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(3);
        setInteger.add(5);
        setInteger.add(7);
        setInteger.add(7);
        setInteger.add(2);
        setInteger.add(3);
        setInteger.add(4);
        setInteger.add(19);
        System.out.println(setInteger);

        Set<Person> people = new HashSet<>();
                people.add(new Person("Jack"));
                people.add(new Person("John"));
                people.add(new Person("Jack"));
                people.add(new Person("Lena"));
                people.add(new Person("Nick"));

                System.out.println(people);

        for (Person p:people){
            System.out.println(p);
        }

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        List<Integer> integers = List.of(1,5,1,2,6,9,19,1,6,5,4);
        ArrayList<Integer> integers1 = new ArrayList<>(new HashSet<>(integers));
        System.out.println(integers1);


    }
}