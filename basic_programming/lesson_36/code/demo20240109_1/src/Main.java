public class Main {
    public static void main(String[] args) {
       Person p1=new Person("Jack");
       Person p2=new Person("Lena");
       Dog d1 = new Dog("Bobik");
       Dog d2 = new Dog("Rex");
       Duck du1 = new Duck("Donald");

       Swimable[] arr1={p1,p2,d1,d2,du1};
       swimAll(arr1);
    }

    public static void swimAll(Swimable[] array){
        for (Swimable el: array){
            el.swim();
        }
    }

    public static void runAll(Runable[] array){
        for (Runable el: array){
            el.run();
        }
    }

}