public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.length()>o.name.length()){
            return 1;
        }
        if (this.name.length()<o.name.length()){
            return -1;
        }
        return 0;
    }
}
