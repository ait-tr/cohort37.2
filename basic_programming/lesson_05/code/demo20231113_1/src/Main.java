public class Main {
    public static void main(String[] args) {
       /*
        if (    условие    ){
            блок кода, если условие true
            команда 1;
            команда 2;
            ....
        } else {
            блок кода, если условие false
            команда 1;
            команда 2;
            ....
        }

        {   }

        */
        int variable = 20;
        int k=0;

        if (variable==10){
            k= variable*5;
            System.out.println(k);
        } else {
            System.out.println(k);
            System.out.println(variable);
        }

        if(variable!=10){
            System.out.println("variable!=10");
        }

        System.out.println("hello" + k);

    }
}