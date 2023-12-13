public class Person {
    private String name;
    private  int age;
    private int[] array;


    public int[] getArray() {
        return array;
    }

    public Person(String name, int age, int[] array) {
        this.name = name;
        this.age = age;
        this.array = array;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
