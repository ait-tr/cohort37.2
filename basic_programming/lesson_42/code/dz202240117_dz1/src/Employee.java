public abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " " + name + " (" + salary+ ")";
    }
}
