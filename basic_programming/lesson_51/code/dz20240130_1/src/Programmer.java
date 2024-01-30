import java.util.List;
import java.util.stream.Collectors;

public class Programmer {
    private String name;
    private String city;
    private List<Task> tasks;

    public Programmer(String name, String city, List<Task> tasks) {
        this.name = name;
        this.city = city;
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        String tasksString = tasks.stream()
                .map(t -> t.toString())
                .collect(Collectors.joining("\n   ","   ",""));

        return "Programmer: " + name + "|" + city + "\n" +tasksString +"\n";

    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
