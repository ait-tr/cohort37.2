public class Main {
    public static void main(String[] args) {
       int[] array = {3,5,5,1,6,8,3,7};
        System.out.println(calcEvenNumbers(array));
    }

    public static int calcEvenNumbers(int[] array){
        int counter=0;
        for(int element : array){
            if (element%2==0){
                counter++;
            };
        }
        return counter;
    }

}