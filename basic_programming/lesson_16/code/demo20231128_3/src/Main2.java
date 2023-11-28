public class Main2 {
    public static void main(String[] args) {
        int[] arr = {10,1};
        System.out.println("1. in main (before method) a =" +arr[0]);
        int b= method1(arr);
        System.out.println("4. in main (after method) a =" +arr[0]);
        arr[0] =100;
        System.out.println("5. in main (change a) a =" +arr[0]);

    }
    public static int method1(int[] arr){
        System.out.println("2. in method a: " + arr[0]);
        arr[0]=arr[0]+10;
        System.out.println("3. in method a: " + arr[0]);
        return arr[0];
    }

}
