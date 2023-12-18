public abstract class Employee {
    private String name;
    private int salary;


    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public  void  paySalary(){
        System.out.println(" gets " + salary + " Euro ");
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
