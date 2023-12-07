public class Temp {
    private int[] arr;

    public Temp(int[] arr) {
        this.arr = arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        int[] res = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            res[i] = arr[i];
        }
        return res;
    }
    public void print(){
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

}
