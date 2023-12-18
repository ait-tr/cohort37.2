public class Programmer extends Employee {
    String lang;

    public Programmer(String name, int salary) {
        super(name, salary);

    }

    @Override
    public String toString() {
        return "Programmer:" + getName() + " (" + getSalary() + ") ";
    }

    public void  work(){
        System.out.println(getName() + ": I am programmer. I write code ");
    }

}
