public class Main {

    public static void main(String[] args) {
        Schoolboy s1= new Boy("John", 10, false);
        Schoolboy s3= new Boy("Nick", 10, true);
        Schoolboy s2= new Girl("Lena", 10);
        Schoolboy s4= new Girl("Sveta", 10, "hello");

        Schoolboy[] pupils = {s1,s2,s3, s4};
        for (Schoolboy s:pupils){
            System.out.println(s + " Word: " + s.getWord());
        }

        s1.trud();
        s2.trud();


    }

}
