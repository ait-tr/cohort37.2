import java.util.function.Predicate;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String personString){
        String[] split = personString.split(",");
        this.name = split[0];
        this.age = Integer.valueOf(split[1]);
    }

    @Override
    public String toString() {
        return name + " (" + age+ ")";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Predicate<Person> getPredicateByAge(int age){
        return new PredicatePersonByAge(age);
    }
    public static Predicate<Person> getPredicateByAge(int ageMin, int ageMax){
        return new PredicatePersonByAgeInterval(ageMin,ageMax);
    }

    public static Predicate<Person> getPredicateByNameSubstring(String name){
        return new PredicatePersonByName(name);
    }
}

class PredicatePersonByAge implements Predicate<Person> {
    int age;

    public PredicatePersonByAge(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Person person) {
        return person.getAge() == age;
    }

}

class PredicatePersonByAgeInterval implements Predicate<Person>{
    private int ageMin;
    private int ageMax;

    public PredicatePersonByAgeInterval(int ageMin, int ageMax) {
        this.ageMin = ageMin;
        this.ageMax = ageMax;
    }

    @Override
    public boolean test(Person person) {
        return person.getAge()< ageMin || person.getAge()>ageMax;
    }
}
class PredicatePersonByName implements Predicate<Person>{
private String name;

    public PredicatePersonByName(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Person person) {
        return person.getName().toLowerCase().contains(name.toLowerCase());
    }
}
