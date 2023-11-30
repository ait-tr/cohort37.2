import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "hello world";

        // int length() - длинна строки, количество символов
        System.out.println(str.length());

        int len = str.length();
        System.out.println(len);

        // String substring(beginIndex, endIndex) - часть строки от beginIndex до endIndex
        // String substring(beginIndex) - часть строки от beginIndex до конца
        // "hello world"
        String str1 = str.substring(2,7);
        System.out.println(str1);

        str1 = str.substring(0);
        System.out.println(str1);

        // boolean equals(String str)
        System.out.println(str.equals("hello world")? "равно":"НЕ равно"); //  str=="hello world"
        System.out.println(str == "hello world"? "равно":"НЕ равно"); //  str=="hello world"

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str3 = scanner.nextLine();
        System.out.println("Введите строку:");
        String str4 = scanner.nextLine();

        System.out.println(str3.equals(str4)? "равно":"НЕ равно"); //  str=="hello world"
        System.out.println(str3 == str4? "равно":"НЕ равно"); //  str=="hello world"
        */


        //
        str = "привет, JaJva! Мы начинаем";
        System.out.println(str.indexOf("Jsav"));
        System.out.println(str.indexOf('J'));
        System.out.println(str.indexOf('J',9));

        String str2= "qwer:qwer1:qwert2:qwert3";

        System.out.println(str2);
        int pos=str2.indexOf(':');
        while (pos!=-1){
            System.out.println("index= "+pos);
            pos=str2.indexOf(':',pos+1);
        }



        System.out.println(str2);
        pos=str2.indexOf("qwer");
        while (pos!=-1){
            System.out.println("index= "+pos);
            pos=str2.indexOf("qwer",pos+1);
        }

        str="HEllo WoRld!";
        String str5= str.toLowerCase();
        System.out.println(str5);

        str5=str.toUpperCase();
        System.out.println(str5);

        str = "johNSon"; // Jonson
        String str6=str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        System.out.println(str6);

        char ch =str.charAt(2);
        System.out.println(ch);


        str= "qwer:qwer1:qwert2:qwert3";
        char findCh=':';
        for (int i=0; i<str.length(); i++){
            char ch1 =str.charAt(i);
            if (ch1==findCh){
                System.out.println(i);
            }
        }

        for ( char currCh : str.toUpperCase().toCharArray()){
            System.out.print(currCh+" ");
        }

    }
}