import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // forEach
        Stream.of("qwe1", "qwe2", "qwe3", "qwe4").forEach(s-> System.out.println(s));

        System.out.println("2: toList()");
        System.out.println(Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.toList()));

        System.out.println("3: toSet()");
        System.out.println(Stream.of("qwe1", "qwe2", "qwe2", "qwe4").collect(Collectors.toSet()));

        System.out.println("3: toCollection()");
        LinkedList<String> value1 = Stream.of("qwe1", "qwe2", "qwe2", "qwe4").collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println(value1);

        System.out.println("3: toCollection(new TreSet()");
        TreeSet<String> value2 = Stream.of("qwe1rr", "qwe2k", "qwe2lkhl;kdsa", "qwe4jjd8")
                .collect(Collectors.toCollection(() -> new TreeSet<>((s1,s2)->s1.length()-s2.length() )));
        System.out.println(value2);
        System.out.println(value2.headSet("qwe3k27"));

        System.out.println("4: joing()");
        String value4 = Stream.of("qwe1", "qwe2", "qwe2", "qwe4").collect(Collectors.joining());
        String value4a = Stream.of("qwe1", "qwe2", "qwe2", "qwe4").collect(Collectors.joining("-"));
        String value4b = Stream.of("qwe1", "qwe2", "qwe2", "qwe4").collect(Collectors.joining("-", "[star:", ":end]"));

        System.out.println(value4);
        System.out.println(value4a);
        System.out.println(value4b);

        System.out.println("5: ");
        int value5a = Stream.of("qwe1", "qwe2", "qwe2", "qwe4").collect(Collectors.collectingAndThen(
                Collectors.joining(),
                s->s.length())
        );
        System.out.println(value5a);

        SortedSet<String> value5b = Stream.of("qwe1", "qwe2", "qwe2", "qwe4").collect(Collectors.collectingAndThen(
                Collectors.toCollection(() -> new TreeSet<>()),
                tSet -> tSet.tailSet("qwe2")
        ));
        System.out.println(value5b);


        // ---------------------------------- MAP
        System.out.println("5: toMap() ");
        Map<String, Integer> map1 = Stream.of("aa", "bbb", "cccccc", "ddd").collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(map1);


        Map<String, Integer> map2 = Stream.of("aa", "bbb", "cccccc", "ddd", "aa").collect(Collectors.toMap(s -> s, s -> s.length(), (i1,i2)->i1+i2 ));
        System.out.println(map2);


        System.out.println("6: groupingBy() ");
        Map<Integer, List<String>> map3 = Stream.of("aa", "bbb", "cc", "ddd", "uuuui").collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(map3);


        System.out.println("7: groupingBy() ");
        Map<Boolean, List<String>> map4 = Stream.of("aa", "bbb", "cc", "ddd", "uuuui").collect(Collectors.partitioningBy(s -> s.length() > 2));
        System.out.println(map4);


    }
}