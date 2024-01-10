import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberReader numberReader = new NumberReader();
        List<Integer> list = numberReader.read();

        System.out.println("Результат:");
        System.out.println(list);
    }
}