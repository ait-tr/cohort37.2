public class Main {
    public static void main(String[] args) {
       Paar paar1= new Paar("Jack", "John");
       System.out.println(paar1);
       paar1.changeFirstStudentName("Nick");
       System.out.println(paar1);

       StringHandler handler = new StringHandler("hello Java is easy");
        System.out.println(handler.reverse());
        System.out.println(handler.countWords(' '));

    }
}