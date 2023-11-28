public class Main {
    public static void main(String[] args) {
        String[] strings = {
                "Hello world!",
                "hello Java world",
                "Jack",
                "hello John",
                "John",
                "That's it!"
        };
        int a=10;
        int b = 20;

        int temp=a;
        a=b;
        b=temp;

        /*
        a=5  (101)     110     110
        b=3  (011)     011     101
             ----      ---     ---
                       101     011
        a = a^b;
        b = a^b;
        a = a^b;

         */
        System.out.println("a=" +a+ " b=" +  b);


        printStringWithLength(strings,4);

    }

    public static void printStringWithLength (String[] array, int length){
       boolean flag=false;
        for(String str : array){   // for (int i=0; i<array.length; i++){String str=array[i];           }
            if(str.length() == length){
                System.out.println(str);
                flag=true;
            }
        }
        if(  !flag ){
            System.out.println("нет таких строк");
        }

    }

}