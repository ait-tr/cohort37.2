import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("q1", "q2", "qw3", "qwe4", "asdfdddd", "qqwe", "asdfdd","rtyuiw","dfghj");
        Map<String, Integer> res = list.stream()
                .filter(s -> s.length() > 3)         // метод стрима: фильтровать стрим
                .map(s -> "(" + s.toUpperCase() + ")")     // метод стрима: преобразовать элемент
                .sorted((s1, s2) -> s1.length() - s2.length())
                .limit(3)                    // метод стрима: ограничить кол-во элементов
                //.collect(Collectors.toSet());
                //.collect(Collectors.toList());
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(res);


        // boolean test(String s)
    }
}