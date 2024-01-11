public class Temp {
    private String msg;
    public   static String DEF_MSG;

    private Temp(String msg){
        this.msg = msg;
    }


    public static void action1(){
        System.out.println("hello from Temp");
    }
    public static void action1(String str){
        System.out.println(str);
    }
    public static void action2(String str){
        System.out.println(str.toUpperCase());
    }

    public void action2(){
        System.out.println(msg.toUpperCase());
    }

    public static Temp getNewObject(String str){
        if(str==null || str==""){
            return new Temp("объект пл умолчанию");
        }
        return new Temp(str);
    }

    public static void setDefMsg(String msg){
        DEF_MSG = msg;
    }
    public static void  printMsg(){
        System.out.println(DEF_MSG);
    }

}
