/*
Реализовать метод, который добавляет в List<Integer>  1000000 случайных целых чисел.

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        long start = System.currentTimeMillis();
        ListCreator.fillIntegerList(list);
        long finish = System.currentTimeMillis();

        System.out.println("===================================");
        for (int i = 0; i < 20; i++) {
            System.out.print(list.get(i) + "   ");
        }
        System.out.println("  ........");
        System.out.println("Time:  " + (finish-start));
    }
}