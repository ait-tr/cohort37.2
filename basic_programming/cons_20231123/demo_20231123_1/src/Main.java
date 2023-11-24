public class Main {
    public static void main(String[] args) {
        int res = method1();
        System.out.println(res);
        //System.out.println( method3() );
        //String resOfMethod3= method3();

        if (method4()){
            System.out.println("Methods run!!!!");
        }
        method5();

    }

    public static int method1(){
        System.out.println("выполняем method1 () ");
        System.out.println(method3());
        return 2*method2();
    }

    public static int method2(){
        System.out.println("выполняем method2 () ");

        return 10;
    }

    public static String method3(){
        System.out.println("выполняем method3 () ");

        return "String from method 3";
    }


    public static boolean method4(){
        System.out.println("выполняем method4 () ");

        return method1()>method2();
    }

    public static void method5(){
        System.out.println("выполняем method5 () ");


    }

}