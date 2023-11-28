public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,6,4};

        System.out.println(compareArrays(array1,array2) ? " равны ":" не равны ");

        //   x = condition ? true value : false value;
        int age=10;
        String text = age>18 ? "взрослый" : "в школу!" ;
    }
    public static boolean compareArrays(int[] array1, int[] array2){
        if (array1.length != array2.length){
            return false;
        }
        for (int i=0; i<array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }

}
