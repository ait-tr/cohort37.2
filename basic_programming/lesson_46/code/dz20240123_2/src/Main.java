import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Дан List<Employee>. У каждого Employee задано имя и стаж работы в фирме. Руководство решило премировать N сотрудников, которые работают дольше всех. Учтите, что если например, нужно премировать 3 сотрудника, но при этом в компании 5 старейших сотрудников с одинаковым стажем, необходимо премировать всех пятерых. Или например, есть 2 старейших сотрудника со стажем 10 лет, и еще 5 со стажем 9 лет - премируем всех семерых.
Необходимо написать метод, который вернет новый List<Employee> премируемых сотрудников.  (* Если нет идей, подсказка на следующей странице)

 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", 10),
                new Employee("Jack", 9),
                new Employee("Lena", 9),
                new Employee("Mata", 10),
                new Employee("Nick", 9),
                new Employee("Pavel", 1)
        );

        System.out.println(getListForBonus(3,employees));
    }

public static List<Employee> getListForBonus(int n, List<Employee> employees){
        if(employees.isEmpty()){
            return Collections.EMPTY_LIST;
        }
        List<Employee> sortedList = new ArrayList<>(employees);
        sortedList.sort(new ComparatorByExperience().reversed());
        List<Employee> result = new ArrayList<>();

        for (int i=0;
             i< sortedList.size() && (result.size()<n || result.get(result.size()-1).getExperience() == sortedList.get(i).getExperience())  ;i++){
            result.add(sortedList.get(i));

        }

        return result;
}

}