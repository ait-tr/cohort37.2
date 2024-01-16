import java.util.ArrayList;
import java.util.List;

public class LmsProjectTeamLead implements TeamLead {
    public String name;
    public String position;
    public List<Employee> list = new ArrayList<>();


    public LmsProjectTeamLead(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        list.remove(employee);
    }

    @Override
    public void notifyEmployees(String msg) {
        for (Employee employee: list){
            employee.notifyHandler(msg);
        }
    }
}
