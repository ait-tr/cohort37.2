/*
Допустим, у вас есть список строк вида: “Jack:in”, “John:in”, “Jack:out”, “Lena:in”,“John:out”. Каждая строка означает, что сотрудник зашел (in) или вышел (out) из офиса. Необходимо написать метод, который вернет список имен сотрудников, которые находятся в офисе.
 */


import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        List<String> list = List.of(
                "Jack:in",  // 1
                "John:in",
                "Jack:out", //-1
                "Lena:in",
                "John:in",
                "John:in",
                "Nick:in",
                "Nick:out"
        );

        System.out.println(task(list));

    }

    public static  List<String> task(List<String> list){
        List<String> result = new ArrayList<>();
        if (list == null || list.isEmpty()){
            //throw new RuntimeException();
            return result;
        }
        //Jack:    (in /  out)

        Map<String,Integer> map = new HashMap<>();
        for (String s: list){
            String[] splitArray = s.split(":");
            if (splitArray.length!=2 || !(splitArray[1].equals("in") || splitArray[1].equals("out")) ){
                throw new RuntimeException();
            }
            String key = splitArray[0];
            int value = splitArray[1].equals("in")?1:-1;
            Integer newValue = map.merge(key, value, (i1, i2) -> i1 + i2);
            if(newValue<0 || newValue>1){
                throw new RuntimeException("не корректный список");
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (var entry: entries){
            if (entry.getValue()>0){
                result.add(entry.getKey());
            }
        }

        return result;
    }

   // our implementation of marge method
    public static Integer merge (Map<String, Integer> map, String key, Integer value, BiFunction<Integer,Integer, Integer> f){
        if(!map.containsKey(key)){
            map.put(key,value);
        } else {
            map.put(key, f.apply(map.get(key), value) );
        }

        return map.get(key);
    }

}