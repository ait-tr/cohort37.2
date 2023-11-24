public class Main {
    public static void main(String[] args) {
        int num=17;
        String str="";
      /*
        if (num%2==0){
            str = "четное";
        } else {
            str = "не четное";
        }

       */
//                1           2           3
        str  = (num%2==0) ? "четное" : "не четное";

        // условие ? значение, если условие true : значение, если условие false

        // 1.   условие
        // 2. значение, если условие true
        // 3. значение, если условие false;


        System.out.println(num + " Число " + str);
        //System.out.println(num + " Число " + ((num%2==0) ? "четное" : "не четное"));

    }
}