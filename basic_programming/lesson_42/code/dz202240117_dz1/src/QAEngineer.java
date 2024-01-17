public class QAEngineer extends Employee{
    public QAEngineer(String name, int salary) {
        super(name, salary);
    }

    public void testCode(){
        System.out.println("QAEngineer " + getName() + " check code");
    }
}
