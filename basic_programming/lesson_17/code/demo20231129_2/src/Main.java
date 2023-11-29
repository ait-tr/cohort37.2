public class Main {
    public static void main(String[] args) {

        int[] array = {2,5,3,8,1,-5,10};


        printIntArray(array);
        System.out.println("----------------------------------");
        System.out.println("Минимальное значение: " + findMinValue(array));
        System.out.println("Индекс минимального значения: " + findIndexOfMin(array));
    }

    public static int findMinValue(int[] array){
        int min=array[0];
        for (int i=1; i<array.length; i++){
            if (array[i]< min) {
                min = array[i];
            }
        }
        return min;
    }

    // using for each
    public static int findMinValue2(int[] array){
        int min=array[0];
        for (int value : array){
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int findIndexOfMin(int[] array){
        int minIndex=0;

        for (int i=1; i< array.length; i++ ){
            if (array[minIndex] > array[i] ){
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static  void printIntArray(int[] array){
        for(int e: array){
            System.out.println(e);
        }
    }
}