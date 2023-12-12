public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.add(new Person("Jack1"));
        people.add(new Person("Jack2"));
        people.add(new Person("Jack3"));
        System.out.println(people);
    }
}