public class Person implements Comparable<Person>{
    private String name;
    private int age;

    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }




    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        int compareName = this.name.compareTo(o.name);
        if(compareName==0){
            return this.age-o.age;
        }
        return compareName;
    }

    public double getHeight() {
        return height;
    }
}
