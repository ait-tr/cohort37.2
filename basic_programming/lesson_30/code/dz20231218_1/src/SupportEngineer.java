public class SupportEngineer extends Employee {
    // super - ссылка на объект родительского класса

    public SupportEngineer (String name, int salary){
        super(name, salary);  // Вызов конструктора род. класса
    }

    public  String toString(){
        return "SupportEngineer:" + getName() + " (" + getSalary() + ") ";
    }

    public void work(){
        System.out.println(getName() + ": I am SupportEngineer. I help users ");
    }




}
