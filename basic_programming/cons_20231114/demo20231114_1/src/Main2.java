public class Main2 {
    public static void main(String[] args) {
        int x=9;
        int y=9;
        int z=9;



        boolean isNotEquals = ( (x != y) || (x != z) || (y != z) );
        System.out.println(isNotEquals);


        if ((x == y) && (x == z))
            System.out.println("All numbers are equal");
        else if ((x != y) && (x != z) && (y != z))
            System.out.println("All numbers are different");
        else
            System.out.println("Some numbers are equal");


        int sum = 2 *(x+y);
        System.out.println("Сумма: " + sum);

        System.out.println("Сумма: " + 2 *(x+y));

        //-------------------------------------
        int j=10;
        int k=10;
        int l=15;
        /*

        if(условие  true/false){
            если условие true
        } else {
            если условие false
        }

         */

        if(k!=l){

            if(k==j && k==l){
                System.out.println("1");
            } else {
                System.out.println("2");
            }
            System.out.println(5);


        } else {
            System.out.println("3");
        }




        System.out.println("4");



    }

}
