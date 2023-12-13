public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.add(new Person("Jack1"));
        people.add(new Person("Jack2"));
        people.add(new Person("Jack3"));



        System.out.println("1: "+people);
        System.out.println("2: "+people.fullToString());

        System.out.println(people.get(2));
        System.out.println(people.size());
        System.out.println(people.freeCapacity());

        System.out.println("------------------------------------");
        people.add(new Person("Jack4"));
        people.add(new Person("Jack5"));
        people.add(new Person("Jack6"));
        people.add(new Person("Jack7"));
        people.add(new Person("Jack8"));
        people.add(new Person("Jack9"));
        people.add(new Person("Jack10"));
        people.add(new Person("Jack11"));
        people.add(new Person("Jack12"));
        people.add(new Person("Jack13"));

        System.out.println("1: "+people);
        System.out.println("2: "+people.fullToString());
        System.out.println("size: " +people.size());
        System.out.println("free size: " +people.freeCapacity());
        System.out.println("-------------------------------------");

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("------------- remove ---------------");
        people.remove(3);
        System.out.println("1: "+people);
        System.out.println("2: "+people.fullToString());
        System.out.println("size: " +people.size());
        System.out.println("free size: " +people.freeCapacity());

        people.add(new Person("Jack100"));
        System.out.println("1: "+people);
        System.out.println("size: " +people.size());
        System.out.println("free size: " +people.freeCapacity());

    }
}