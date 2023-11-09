public class Main {
    public static void main(String[] args) {
        String str;  // объявление

        str= "hello";  // присвоение значения

        System.out.println(str);

        str="new value";

        System.out.println(str);

        //--------------------

        String str2="2343";
        String str3="1";
        System.out.println(str2+str3);  // "2343" + "1" -> "23431"

        // примитивные  типы (8)            объектные (ссылочные) типв

        int num1 = 10;
        System.out.println(num1);
        double num2 = 101.4;
        System.out.println(num2);
        System.out.println(num1+num2);
        System.out.println(10.0/3);
        System.out.println(3.333333333333333333);

        int a=10;
        int b=3;
        System.out.println(a/b);    // результат целочисленный
        System.out.println(a*1.0/b); //


        // S= 3,14 * r^2
        // S= 3,14 * (r*r)



    }
}