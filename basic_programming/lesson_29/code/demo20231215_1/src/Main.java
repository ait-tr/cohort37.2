public class Main {
    public static void main(String[] args) {

        Programmer p1 = new Programmer("Jack", 4000);
        Programmer p2 = new Programmer("Lena", 5000);
        QAEngineer q1 = new QAEngineer("John", 5500);
        QAEngineer q2 = new QAEngineer("Ira", 4500);

        /*
        Programmer[] programmerArray = {p1,p2};
        QAEngineer[] qaEngineerArray = {q1,q2};

        for (Programmer programmer: programmerArray){
            programmer.work();
            programmer.paySalary();

        }

        for (QAEngineer qaEngineer:qaEngineerArray){
            qaEngineer.work();
            qaEngineer.paySalary();
        }

         */

        Employee[] employees = {p1,p2,q1,q2};
        for (Employee employee: employees){
            //System.out.println(employee);
            employee.paySalary();
            employee.work();
        }

    }
}