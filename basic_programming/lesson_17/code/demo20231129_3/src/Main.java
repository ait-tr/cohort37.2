public class Main {
    public static void main(String[] args) {

        int[][] arrayOfarrays = {
                {2,5,3,8,1,-5,10},
                {2,5,3},
                {2,5,6,8,1,-5,10}
        };

        System.out.println(arrayOfarrays[0][1]);

        int[] array = {2,5,3,8,1,-5,10};
        int[] array1 = {2,5,3};
        int[] array2 = {2,5,6,8,1,-5,10};
        int[] array3 = {2,2,3,891,-5,10,8,9,6,3,2};
        int[] array4 = {2,5,3,2,1,-5,10};

       plusEin(array);
       plusEin(array1);

       printIntArray(array);
       printIntArray(array1);
       printIntArray(array2);
       printIntArray(array3);
       printIntArray(array4);

    }
     public static void  plusEin(int[] array){
        for(int i=0; i<array.length; i++){
            array[i]++;
        }
     }

    public static  void printIntArray(int[] array){
        for(int e: array){
            System.out.print(e+" ");
        }
        System.out.println();
    }

}