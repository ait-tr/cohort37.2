/*
заполнить заданный массив int четными числами начиная с заданного четного числа n
 */

public class Main {
    public static void main(String[] args) {
        int[] arr= new int[10];
        fillArray(arr, 2);
        printArray(arr);

        int[] arr2 = new int[5];
        fillArray(arr2, 1000);
        printArray(arr2);
    }

     //     [ 2 , 4 , _ , _ , _  ]    n=2                     [ 2, 4, 6, 8, 10]
    public static int[]  fillArray(int[] array, int n){

        for (int i=0; i<array.length; i++){
            array[i] = n;
            n+=2;
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + "   ");
        }
        System.out.println();
    }

}

