import java.util.ArrayList;
import java.util.List;

public class  Team <T extends  Employee>{

    private Manager manager;
    private List<T> list = new ArrayList<>();

    public Team(Manager manager) {
        this.manager = manager;
    }

    public List<T> getList() {
        return list;
    }

    public void printTeamList(){
        for (T e: list){
            System.out.println(e.getName() + " з.п. " + e.getSalary());
        }
    }

    public void add(T employee){
        list.add(employee);
    }

}
