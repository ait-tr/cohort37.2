public class QAEngineer extends Employee {


    public QAEngineer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "QAEngineer:" + getName() + " (" + getSalary() + ") ";
    }

    public void  work(){
        System.out.println(getName() + ": I am QAEngineer. I check software ");
    }


}
