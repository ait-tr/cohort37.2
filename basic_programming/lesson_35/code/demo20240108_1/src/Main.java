public class Main {
    private   int field =10;


    public static void main(String[] args) {

        Main m = new Main();
        System.out.println(m.field);

        Student.count();

        Student person1 = new Student("Jack", new MyDate(20,2,2000));
       Student person2 = new Student("John", new MyDate(3,4,2002));


        Student.count();

        Student person3 = new Student("Jack1", new MyDate(20,2,2000));
        Student person4 = new Student("John1", new MyDate(3,4,2002));

        Student.count();

        System.out.println(person1);
        System.out.println(person4);

        Group group = Group.instance;
        Group group1= Group.instance;

        System.out.println(group);

        // ------------------------------
        Group2 g1= Group2.getInstance("33");
        System.out.println(g1);

        Group2 g2= Group2.getInstance("34");
        System.out.println(g2);



    }
}