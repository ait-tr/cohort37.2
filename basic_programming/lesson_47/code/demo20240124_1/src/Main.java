import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jack",10);
        map.put("John",15);
        map.put("Ann",17);
        map.put("Nick",16);

        Integer value1 = map.putIfAbsent("Jack", 20);
        System.out.println(value1);
        System.out.println(map);
        System.out.println("------------------------------------");
        map.forEach(new BiConsumer1());

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));

 ///-----------------------------------------------------------------------
        list.forEach(new Consumer1());
        System.out.println("----------------------------------------");

 /// ------------------------------------------------------------------------
        list.forEach(new Consumer<Integer>() {  // class X001 implements Consumer
            @Override
            public void accept(Integer integer) {
                System.out.println("значение: "+integer);
            }
        });
///----------------------------------------------------------------------------
        Consumer<Integer> cons = new Consumer<>() {  // class X001 implements Consumer
            @Override
            public void accept(Integer integer) {
                System.out.println("значение: " + integer);
            }
        };
        list.forEach(cons);

/// --------------------------------------------------------------------------
        list.forEach(  (Integer i)->{ System.out.println("значение: " + i); }   );
        list.forEach(  i->System.out.println("значение: " + i));

        list.sort((o1,o2) -> {return o2.compareTo(o1);});

        List<String> qwe = List.of("qwe", "tyu", "tyu");
        /*
        qwe.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {

            }
        });

         */
        qwe.forEach((s)->{
            System.out.println(s);
        });
    }
}