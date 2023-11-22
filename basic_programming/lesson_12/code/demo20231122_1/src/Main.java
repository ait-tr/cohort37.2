public class Main {
    public static void main(String[] args) {
        char ch = 'A';
        String str = "A";    // !!!   ""   vs   ''

        /*
        'A' = 65 // 1000001
        'B' = 66 // 1000010


         */

        System.out.println(ch);
        System.out.println(10  + ch);   // не 10A, но 75   !!!
        System.out.println(0  + ch);   // код символа 'A'
        System.out.println( (int)ch );   // код символа 'A'
        boolean res1 = 'A'>'B';   // сравнивает коды символов 65>66 false

        String hello ="  hello Java!       ";

        // methods of string
        String str1= hello.toUpperCase();
        System.out.println(str1);

        str1= hello.toLowerCase();
        System.out.println(str1);

        hello=hello.trim();   // обрезать пробелы

        int length= hello.length();  // количество символов в строке
        System.out.println(length);

        System.out.println("------------------------------");
        System.out.println(hello);
        char ch1= hello.charAt(0);
        System.out.println(ch1);
        ch1=hello.charAt(1);
        System.out.println(ch1);

        ch1=hello.charAt(2);
        System.out.println(ch1);

        ch1=hello.charAt(hello.length()-1);  // индекс последнего символа в строке hellо
        System.out.println(ch1);

        System.out.println("---- перебор всех символов в строке ");
        String str2 ="перебор всех";

        for (int i=0; i < str2.length(); i++ ){
            char sim = str2.charAt(i);
            System.out.println(sim);
        }
        System.out.println("----------  REVERS --------");
        for (int i = str2.length()-1; i>=0; i--){
            char sim = str2.charAt(i);
            System.out.println(sim);
        }


        System.out.println("");
        String str3="";
        for (int i = str2.length()-1; i>=0; i--){   // i= 11   10   9   8 ......         0
            char sim = str2.charAt(i);             // x  e  c
            str3 += sim;  // str3 = str3 + sim     // x  xe  xec
        }
        System.out.println(str3);


    }
}