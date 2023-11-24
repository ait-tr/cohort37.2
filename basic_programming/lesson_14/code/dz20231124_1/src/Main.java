/*
Реализовать метод, который в качестве параметров принимает строку и символ.
Метод должен вернуть, сколько раз заданный символ встречается в заданной строке. Например:
Строка "Hello Java" символ 'l' результат 2
Строка "Hello Java" символ 'p' результат 0

 */


public class Main {
    public static void main(String[] args) {
        int countSim = countSymbol("Hello Java", 'l');            //ch1 можно менять в скобках
        System.out.println(countSim);
    }

    public static int countSymbol(String str, char ch1) {               // method должен вернуть номер, поэтому тип int
        int counter = 0;                                            // переменная, которая будет считать сколько раз символ встречается
        for (int i = 0; i < str.length(); i++) {                        // стандартный перебор всей строки
            char currentChar = str.charAt(i);
            if (currentChar == ch1) {                                   // условие
                counter++;                                          // что делать если условие true
            }
        }
        return counter;
    }
}