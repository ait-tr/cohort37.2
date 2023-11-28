public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("1. in main (before method) a =" +a);
        int b= method1(a);
        System.out.println("4. in main (after method) a =" +a);

    }
     public static int method1(int a){
         System.out.println("2. in method a: " + a);
         a=a+10;
         System.out.println("3. in method a: " + a);
         return a;
     }

}