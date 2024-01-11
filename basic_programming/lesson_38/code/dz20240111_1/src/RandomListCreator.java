import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListCreator implements IntegerListCreator {
    private int size;
    private int maxValue;
    private int minValue;

    public RandomListCreator(int size, int minValue, int maxValue) {
        this.size = size;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    @Override
    public List<Integer> create() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            list.add(random.nextInt(maxValue-minValue+1)+minValue);
        }
        return list;
    }
}
