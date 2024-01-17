public class Manager extends Employee{
    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void manage(){
        System.out.println("Manager " + getName() + " wait result");
    }
}
