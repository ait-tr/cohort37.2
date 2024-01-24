/*
 Дан лист строк, необходимо получить Map<String,Integer> такой,
 что ключом является строка из исходного листа, значением, сколько раз она встречается в листе.

 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "Jack", "Ira", "Lena", "Ira", "Jack", "Ira", "John");
        System.out.println(list);
        System.out.println(count3(list));


    }
    public static Map<String,Integer> count(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String str: list){
            Integer v = map.get(str);
            if(map.containsKey(str)){
                map.put(str, v);
            } else {
                map.put(str,1);
            }
        }
        return map;
    }

    public static Map<String,Integer> count1(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String str: list){
            Integer v = map.get(str);
            map.put(str, v==null ? 1 : v+1);
        }
        return map;
    }

    public static Map<String,Integer> count2(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String str: list){
            Integer v = map.getOrDefault(str, 0);
            map.put(str,v+1);

        }
        return map;
    }

    public static Map<String,Integer> count3(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String str: list){
            Integer v = map.putIfAbsent(str,1);
            if(v!=null) {
                map.put(str,v+1);
            }

        }
        return map;
    }

}
