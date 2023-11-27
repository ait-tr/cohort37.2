/*
Реализуйте метод String insertStr (String target, String source, int position).
    target - целевая строка
    source - вставляемая строка
    position - позиция вставки
Метод должен возвращать новую строку, которая получена путем "вставки" строки source
в строку target в позицию position.
    - Если position больше длинны строки target тогда результат - простое объединение строк.
    - Если position больше длинны строки target, то строка source вставляется
в строку target в позицию position, а остаток строки target отзывается в конце

Примеры:

insertStr ("Hello", " world", 10) Результат: "Hello world"
insertStr ("Script", "Java", 0) Результат: "JavaScript"
insertStr ("I am busy", "not very ", 5) Результат: "I am not very busy"
Эту задачу можно решить двумя способами: используя substring и используя только цикл, length и charAt

 */
public class Main {
    public static void main(String[] args) {
        System.out.println(insertStr ("Hello", " world", 10));
        System.out.println(insertStr ("Script", "Java", 0));
        System.out.println(insertStr ("I am busy", "not very ", 5));
    }


    // substring
    public static String insertStr (String target, String source, int position){

        if(position>=target.length()){
            return target+source;
        }
        if (position<=0){
            return source+target;
        }

        return target.substring(0,position) + source + target.substring(position);
    }

    // loops and charAt()
    public static String insertStr2 (String target, String source, int position){
        String result="";

        if(position>=target.length()){
            return target+source;
        }
        if (position<=0){
            return source+target;
        }


        for(int i=0; i<target.length(); i++){
            if (i==position){
                result +=source;
            }
            char ch = target.charAt(i);
            result = result+ch;
        }
        return result;
    }


}