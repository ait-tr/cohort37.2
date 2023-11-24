/*
Реализовать метод, который возвращает первое слово в заданной строке
(в рамках данной задачи считаем, что слова отделены пробелом и в строке нет знаков препинания).
Например: "Олег Иванов", результат: "Олег"

 */

public class Main {
    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println(firstWord2(str));
    }

    public static String firstWord(String str){
        str=str.trim();
        String result="";
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch==' '){
                break;
            }
            result=result + ch;
        }
        return result;
    }

    public static String firstWord2(String str){

        for (int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if (ch==' '){
                return str.substring(0,i);
            }
        }
        return str;
    }

    public static String firstWord3(String str){

        int indexOfSpace =  indexOf(str, ' ');
        return  indexOfSpace>0 ?  str.substring(0,indexOfSpace) : str;

    }


    public static int indexOf(String str, char ch){

        for (int i=0; i < str.length(); i++){
            char currentChar =  str.charAt(i);
            if(currentChar==ch){
                return i;
            }
        }
        return -1;
    }


    //str.trim() - обрезает пробелы в начале и в конце строки.
    //str.substring(begin, end) - возвращает часть строки с begin до end
}