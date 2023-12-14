import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] qwe ={0,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(qwe));

        qwe= Arrays.copyOf(qwe, 20);
        System.out.println(Arrays.toString(qwe));

        qwe= Arrays.copyOf(qwe, 6);
        System.out.println(Arrays.toString(qwe));

        qwe = Arrays.copyOfRange(qwe, 1,4);
        System.out.println(Arrays.toString(qwe));
    }
}
