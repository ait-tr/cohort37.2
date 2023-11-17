import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       printCubed(3);
       printCubed(2);
       printCubed(32);

       int a = 6;
       printCubed(a); ///  printCubed(6)

        print2Msg("java is ");
    }

    public  static  void print2Msg(String msg){
        System.out.println(msg);
        System.out.println(msg);
    }

    public static  void  printCubed (double number){
      //                                                                  cubed(6)
        System.out.println( "Число "+ number +" в третьей степени это " + cubed(number)  );
    }


    public static  double cubed(double number){
       double result = number*number*number;
       return  result;
    }
}