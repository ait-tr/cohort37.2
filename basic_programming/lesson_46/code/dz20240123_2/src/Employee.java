import java.util.Comparator;

public class Employee {
    private String name;
    private  int experience;

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + " (" + experience + ")";
    }

    public int getExperience() {
        return experience;
    }
}
class ComparatorByExperience implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getExperience()-o2.getExperience();
    }
}
