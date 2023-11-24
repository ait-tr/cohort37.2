public class Main3 {
    public static void main(String[] args) {
        String str="abcdxjq";
        char ch;
        ch= str.charAt(0);
        ch= str.charAt(1);
        ch= str.charAt(2);
        ch= str.charAt(3);

        // .....

        int i;
        for (i = 0; i < 100 && i < str.length(); i++) {
            ch= str.charAt(i);

            System.out.println("i в цикле = " +i);

        }
        System.out.println(i);
        System.out.println("----------------------");
        /*
        if (str.length()>12){
            i=12;
        } else {
            i= str.length();
        }
         */
        for (i= ( str.length()>12 ? 12 : str.length()  ) ; i>=0; i--){
            System.out.println("i в цикле = " +i);
        }



    }



}
