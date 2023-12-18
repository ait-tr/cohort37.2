/*
* В коде классной работы (проект Employee) реализовать класс SupportEngineer,
сделать его наследником Employee. Реализовать в нем метод work()
* В коде классной работы (проект Employee) реализовать класс Manager,
  сделать его наследником Employee. Реализовать в нем метод work(). Добавить в класс Manager поле bonus.
  Реализовать метод paySalary таким образом, что бы Manager получал зарплату + bonus

 */
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

        Employee[] employees = {p1,p2,q1,q2,
        new SupportEngineer("Oleg", 3800),
        new Manager("Nick", 6000,1000),
        //new Employee("Kesha", 6000)
        };
        for (Employee employee: employees){
            //System.out.println(employee);
            employee.work();
            employee.paySalary();
        }

        Manager ttt=new Manager("Nick", 6000,1000);

    }
}