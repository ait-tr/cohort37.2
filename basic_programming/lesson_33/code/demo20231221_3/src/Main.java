public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(10,"Jack", 22);
        Person p2 = new Person(10,"Jack", 22);
        Person p3 = p1;


        System.out.println("==     :"  + (p1==p2));
        System.out.println("equals :"  + (p1.equals(p2)));
        System.out.println("---------------------------------");
        System.out.println("==     :"  + (p1==p3));
        System.out.println("equals :"  + (p1.equals(p3)));

    }
}