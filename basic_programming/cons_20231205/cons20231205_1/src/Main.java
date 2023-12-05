public class Main {
    public static void main(String[] args) {
        String str ="Hello world!";
        String res = "";
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            System.out.println("res= '" + res + "'     ch= " + ch);
            if (i%2==0) {
                res = res + ch;
            }  else {
                res = res + '#';
            }

        }

        /*
        "Java world is very interest!"
        "Java world is very"
        "Java world is very very interest!"
         */

        String str1 ="Java world is very interest!";
        String res1 = str1.substring(5,18);
        System.out.println( res1 );


        res1= str1.substring(0, str1.length()-3);
        System.out.println(str1);
        System.out.println(res1);
        res1= str1.substring(3, str1.length()-3);
        System.out.println("   " + res1);
        res1 = str1.substring(str1.length()-3);
        System.out.println(res1);
        res1= str1.substring(0,3) + str1.substring(str1.length()-3);
        System.out.println(res1);

        System.out.println("A".repeat(10));
        String str3="";
        for(int j=0; j<10; j++){
            str3 += "A";
        }
        System.out.println(str3);
        System.out.println("---------------------------------------------");
        str1="ja";
        //res1= str1.substring(0, (str1.length()>3 ? str1.length()-3 : str1.length()) );
        res1= str1.length()>3 ?  str1.substring(0, str1.length()-3) : str1;
        System.out.println(res1);
        System.out.println("--------------------------------------------");

        IntArrayHandler obj = new IntArrayHandler();
        System.out.println(obj);

        obj.addValue(15);
        obj.addValue(10);
        obj.addValue(5);
        System.out.println(obj);
        obj.addValue(9);
        obj.addValue(8);
        System.out.println(obj);


    }

}