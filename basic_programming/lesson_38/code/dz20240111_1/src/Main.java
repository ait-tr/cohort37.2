/*
Давайте реализуем утилитарный класс, для работы со списком (List) целых чисел.
Вам нужно реализовать несколько [статических] методов:
поиск наибольшего числа
поиск наименьшего числа
поиск суммы чисел
Естественно, каждый из методов должен получать в качестве параметра List<Integer>


В вашей программе должно быть предусмотрено несколько  способов получения данных ну т.е. того самого List<Integer>:
возможность получить список со Scanner
возможность получить случайный список
возможность получить список заданный константно в программе, например [1,7,7,2,3].
Этот вариант актуален для проверки корректности работы методов из первой задачи на известных данных.


 */

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //IntegerListCreator integerListCreator = new ConstantListCreator()
        //IntegerListCreator integerListCreator = new ScannerListCreator();
        IntegerListCreator integerListCreator = new RandomListCreator(10,-5,5);

        List<Integer> list = integerListCreator.create();
        System.out.println(list);

        // -------------------------------------------------------

        // Ctrl+Alt+V
        int maxValue = IntegerListUtil.findMaxValue(list);
        int minValue = IntegerListUtil.findMinValue(list);
        long sumValue = IntegerListUtil.sum(list);
        System.out.println("Max =" + maxValue);
        System.out.println("Min =" + minValue);
        System.out.println("Sum =" + sumValue);


    }
}