public class Temp2 {
    static double  pi = 3.1415;
    private static int counter = 0;
    private String title;

    public Temp2(String title) {
        this.title = title;
    }

    public void qwe(){
        counter++;
        System.out.println("Object " +title + "  run qwe " + counter + " раз");
    }

    public static void main(String[] args) {
        Temp2 t1=new Temp2("tt1");
        Temp2 t2=new Temp2("tt2");
        Temp2 t3=new Temp2("tt3");

        t1.qwe();
        t2.qwe();
        t3.qwe();
        t1.qwe();
        t1.qwe();
        t1.qwe();
    }

}
