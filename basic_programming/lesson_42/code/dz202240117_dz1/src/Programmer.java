public class Programmer extends Employee{
    public Programmer(String name, int salary) {
        super(name, salary);
    }

    public void writeCode(){
        System.out.println("Programmer " + getName() + " write code");
    }

}
