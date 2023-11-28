public class Main {
    public static void main(String[] args) {
        int[] a={10,18,19,1,87};
        String[] names = {"jack","elena", "john"};

        // объявление пустого массива на 10 элементов int
        int[] array1 = new int[10];
        String[] strings1 = new String[7];

        printArray(array1);
        array1[3] = 11;
        array1[7] = array1[3]+12;
        for (int i=0; i<array1.length;i++){
            array1[i]= array1[i]+1;
        }

        printArray(array1);
        printArray(a);


    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + "   ");
        }
        System.out.println();
    }

}