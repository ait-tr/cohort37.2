import java.util.List;
import java.util.Scanner;
/*
try{

} catch {

}
--------------------------------------
throw new Exception();


 */


public class Main {
    public static void main(String[] args) {

        int a=10;
        try {
            int b = readInt();
            System.out.println(div(a,b));
        } catch (Exception e){
            System.out.println(e.getMessage());
            //System.out.println("что то пошло не так");
        }

    }
    public static double div(int a, int b){
        if (b==0) {
            throw new RuntimeException("делить на ноль нельзя");
        }
        double rez = a/b;
        return rez;
    }

    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }




}