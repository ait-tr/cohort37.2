public class Main {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c=3;

   // &&  ||

        if ((a==b) && (a==c)){
            System.out.println("все переменные равны");
        } else {
            System.out.println("нет");

        }

        // a==b==c    =>     (a==b && b==c)


    }
}