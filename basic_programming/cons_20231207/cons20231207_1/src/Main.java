public class Main {
    public static void main(String[] args) {
        int a1;
        int a2=20;
        a1=10;
        a1 = 30;
        System.out.println(a1);
        a1 = a2;
        System.out.println(a1);
        a2 = 7;
        System.out.println(a1  + "    " + a2);
        m1(a1);
        System.out.println(a1);

       Person p1 = new Person("Jack",10);
       Person p2 = p1;

       p1.setAge(20);
        System.out.println(p1);
        System.out.println(p2);
        p2.setAge(33);
        System.out.println(p1);
        System.out.println(p2);

        m2(p1);
        System.out.println(p1);
        System.out.println(p2);

    }

    public static void m1(int a1){
        a1=10;
        System.out.println(a1);
    }

    public static void m2(Person p1){
        Person ppp = new Person(p1.getName(), p1.getAge());
        ppp.setAge(111);
        System.out.println(p1);
    }


}