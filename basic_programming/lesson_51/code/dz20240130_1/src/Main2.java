import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Task[] tasks = {
                new Task("info about task 1", 10, Status.PROCESSED),
                new Task("info about task 2", 3, Status.PROCESSED),
                new Task("info about task 3", 6, Status.PROCESSED),
                new Task("info about task 4", 2, Status.PROCESSED),
                new Task("info about task 5", 4, Status.DONE),
                new Task("info about task 6", 8, Status.PROCESSED),
                new Task("info about task 7", 11, Status.PROCESSED),
                new Task("info about task 8", 21, Status.DONE),
                new Task("info about task 9", 10, Status.PROCESSED),
                new Task("info about task 10", 1, Status.CANCELED),
        };

        List<Programmer> programmers = List.of(
                new Programmer("Jack", "Berlin", List.of(tasks[0], tasks[2], tasks[3])),
                new Programmer("Eduard", "Potsdam", List.of(tasks[0], tasks[4], tasks[3], tasks[7])),
                new Programmer("Lena", "Berlin", List.of(tasks[2])),
                new Programmer("John", "Hamburg", List.of(tasks[2], tasks[3], tasks[4])),
                new Programmer("Pavel", "Potsdam", List.of(tasks[0])),
                new Programmer("Olga", "Berlin", List.of(tasks[0], tasks[3]))
        );

        System.out.println("--------------- task 3 ---------------");
        Map<Task, List<Programmer>> mapProgrammersByTask = getMapProgrammersByTask(programmers);
        for(var entry: mapProgrammersByTask.entrySet()){
            System.out.println(entry.getKey());
            System.out.println("   "+ entry.getValue().stream()
                    .map(p -> p.getName() + "|" + p.getCity())
                    .collect(Collectors.joining(",")));
        }
    }

    public static Map<Task,List<Programmer>> getMapProgrammersByTask (List<Programmer> programmers){
        if(programmers==null){
            throw  new EmptyProgrammersListException("List Programmer is Empty");
        }

        class TaskProgrammer{
            private Task task;
            private Programmer programmer;

            public TaskProgrammer(Task task, Programmer programmer) {
                this.task = task;
                this.programmer = programmer;
            }

            public Task getTask() {
                return task;
            }

            public Programmer getProgrammer() {
                return programmer;
            }
        }


        var map = programmers.stream()
                .flatMap(p -> p.getTasks()
                        .stream()
                        .map(t -> new TaskProgrammer(t, p))
                )
                .collect(Collectors.groupingBy(tp -> tp.getTask(),
                                               Collectors.mapping(tp->tp.getProgrammer(), Collectors.toList())   ));

        return map;

    }





}
