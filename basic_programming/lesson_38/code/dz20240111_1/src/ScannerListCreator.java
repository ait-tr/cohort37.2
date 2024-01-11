import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerListCreator implements IntegerListCreator{

    @Override
    public List<Integer> create() {

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько значений Вы хотите ввести: ");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println("Введите значение №" +i + ":");
            list.add(scanner.nextInt());
        }
        System.out.println();

        return list;
    }
}
