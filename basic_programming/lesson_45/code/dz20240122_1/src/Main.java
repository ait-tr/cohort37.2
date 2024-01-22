/*
Есть два списка одинаковой длины с числами. Написать функцию, которая
вернет список с элементами True или False, где значение на i-том месте зависит от того, равны ли элементы двух списков под номером i.
Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {False, True, True, False}

Дан список строк вида “John,18” т.е. имя,возраст. Необходимо получить список Person.


 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(1, 2, 3, 4);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(task2(list1,list2));

    }


    public static List<Boolean> task1(List<Integer> list1, List<Integer> list2 ){
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < list1.size() ; i++) {
            if (list1.get(i).equals(list2.get(i))) {
                result.add(Boolean.TRUE);
            } else {
                result.add(Boolean.FALSE);
            }
        }


        return result;
    }

    public static List<Boolean> task2(List<Integer> list1, List<Integer> list2 ){
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < list1.size() ; i++  ){
            result.add(list1.get(i).equals(list2.get(i)));
        }
        return result;
    }

}