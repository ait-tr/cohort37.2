/*
Дан  List<Student>. У каждого студента есть имя и список оценок. Необходимо получить
список строк вида: John, 4.76 т.е. имя, средний балл


 */

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Jack", List.of(3, 4, 3, 4, 3, 4)),
                new Student("Lena", List.of(5, 5, 5, 5)),
                new Student("John", List.of(5, 5, 4)),
                new Student("Nick", List.of(3, 4, 3, 4, 3, 4, 5, 5, 5))
        );
        System.out.println(students);
        System.out.println(listToStrigList(students));

    }

    public static List<String> listToStrigList(List<Student> people){
        List<String> result = new ArrayList<>();
        for (Student student:people){
            result.add(student.getName()+","+student.getAvgMark());
        }

        return  result;
    }
}