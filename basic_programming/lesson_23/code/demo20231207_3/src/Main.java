public class Main {
    public static void main(String[] args) {

        int a1=10;
        int a2=20;
        int a3=a1;

        MyDate date1= new MyDate(10,11,2000);
        MyDate date2= new MyDate(10,11,2001);
        MyDate date3= date1;
        MyDate date4=date3;

        System.out.println(date1 + "  " + a1);
        System.out.println(date2 + "  " + a2);
        System.out.println(date3 + "  " + a3);

        date3.setYear(1999);
        a1=555;
        System.out.println("-------------------------------------");
        System.out.println(date1 + "  " + a1);
        System.out.println(date2 + "  " + a2);
        System.out.println(date3 + "  " + a3);

        /*
        10-11-2000      10-11-1999
        10-11-2001      10-11-2001
        10-11-1999      10-11-1999
         */


    }
}