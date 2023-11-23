/*
Реализовать метод String substring(String str, int index) который возвращает строку - часть исходной строки, начиная с символа с индексом index и до конца строки.
Например:
substring("hello Java world", 6) должен вернуть "Java world"

 */
public class Main {
    public static void main(String[] args) {
        String str = "hello Java world";
        int index=6;
        //System.out.println(substring(str,index));
        demo();

    }

    /*
       - перебрать все символы от позиции index и до конца строки
       - каждый символ прибавить к строке-результату
     "01234"
     */
    public static String substring(String str, int index){

        String result="";
        for (int i=index; i < str.length(); i++) {
            result += str.charAt(i);     ///  result = result + str.charAt(i);
        }
        return result;
    }

    public static void demo(){

        //String str = "0123456789";
        String str = "qwertyui";
        System.out.println(str.length());
        int len = str.length();
        System.out.println("Строка: " + str);
        System.out.println("количество символов в строке: " + str.length() + "  str.length()   ");
        System.out.println("индекс первого символа в строке: " + 0);
        System.out.println("первый символ в строке: '" + str.charAt(0) +"'    str.charAt(0) ");
        System.out.println("индекс последнего символа в строке: " + (str.length()-1) +  "   (str.length()-1)   " );
        System.out.println("последний символ в строке: '" + str.charAt(str.length()-1) + "'  str.charAt(str.length()-1)    " );

        String str1 = str.substring(4);
        System.out.println("Результат вызова str.substring(4) : " + str1);

        String str2 = str.substring(4,6);
        System.out.println("Результат вызова str.substring(4,6) : " + str2);




        for (int i = 0; i<str.length(); i++){   // перебор

        }

    }


}