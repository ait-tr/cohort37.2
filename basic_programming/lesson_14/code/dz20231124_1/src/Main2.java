/*
Реализовать метод, который в качестве параметров принимает строку и символ.
Метод должен вернуть, сколько раз заданный символ встречается в заданной строке. Например:
Строка "Hello Java" символ 'l' результат 2
Строка "Hello Java" символ 'p' результат 0

 */

public class Main2 {
    public static void main(String[] args) {
        int countSim = countChar("Hello Java", 'l');            //ch1 можно менять в скобках
        System.out.println(countSim);
    }

    public static int countChar (String str, char ch){
        int result=0;

        for(int i=0; i < str.length(); i++) {  //"qwert"      // i - index

            char current= str.charAt(i);  // очередной символ в строке

            if (current==ch){
                result++; // result = result+1
            }
        }

        return result;
    }
    // str.length()  - количество символов в строке
    // str.charAt(i) - i-тый символ в строке, т.е. символ в позиции i
}
