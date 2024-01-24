/*
Дан map<String,Integer>. Если в данной map есть ключи “add1” и “add2” (именно такие)
необходимо сформировать новой ключ “summ” со значением суммы значений из ключа   “add1” и “add2”.

 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("add2",12);
        map.put("john",10);
        map.put("add1",67);
        map.put("lena",10);
        map.put("jack",22);

        System.out.println(map);
        System.out.println("-------------------------");
        task(map, "add1", "add2");
        System.out.println(map);



    }

    public static void task(Map<String,Integer> map, String key1, String key2){
        if (map.containsKey(key1) && map.containsKey(key2)) {
            Integer i1 = map.get(key1);
            Integer i2 = map.get(key2);
            map.put("summ", (i1==null?0:i1) + (i2==null?0:i2)  );
        }
    }


}

/*
        Integer i;
        Short s;
        Byte b;
        Boolean b1;
        Double d;
        Long l;
        Character c;
 */