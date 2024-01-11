import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Temp.action1();
       Temp.action1("qwer");
       Temp.action2("qwer");

        Temp t1=Temp.getNewObject("1qwe");
        Temp t2=Temp.getNewObject("2qwe");
        t1.action2();
        t2.action2();
        Temp.setDefMsg("hello");
        t1.printMsg();
        t2.printMsg();
        Temp.printMsg();

        t1.DEF_MSG ="not hello";

        t1.printMsg();
        t2.printMsg();
        Temp.printMsg();



    }
}