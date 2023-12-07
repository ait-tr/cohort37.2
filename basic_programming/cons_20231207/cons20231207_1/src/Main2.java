public class Main2 {
    public static void main(String[] args) {
        int[] arr =  new int[]{1,2,3};
        arr[0] =10;

        //m1(arr);

        Temp temp= new Temp(arr);
        temp.print();
        int[] arr1 = temp.getArr();
        arr1[0]=100;

        temp.print();
    }
    public static void m1(int[] arr){
        arr[0] =20;
    }




}
