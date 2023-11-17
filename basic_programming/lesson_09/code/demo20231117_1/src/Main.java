public class Main {

    public static void main(String[] args) {
        printMsg("hello");

        int a=10;
        System.out.println("a в main: " + a);

        printMsg("java");
        printMsg("time" +" is running");
        String str = "qwerty string";
        printMsg(str);
    }

    public static double getArea(int radius){

        return 0;
    }

    public static void printMsg(String msg){
        System.out.println("----- method printMsg is started");
        int a=20;
        System.out.println("    a в printMsg: " + a);

        System.out.println("    Our message is: " + msg);
        System.out.println("----- method printMsg is finished");
    }

}