/*
5! = 5*(4*3*2*1)
5! = 5 * (5-1)!
4! = 4 * (4-1)!
3! = 3 * 2!
2! = 2 * 1!
1!= 1

 */

public class Main {
    public static void main(String[] args) {
        method1(5);
        System.out.println(factorial(6));
    }

    public static int factorial(int n){
        if (n==1){
            return 1;
        } else {
            return n*factorial(n-1);
        }

    }


    public static int method1(int arg) {
        System.out.println(" start method 1 with arg = " + arg);
        if (arg == 0) {
            return 0;
        } else {
            return  method1(arg-1);
        }

    }
}