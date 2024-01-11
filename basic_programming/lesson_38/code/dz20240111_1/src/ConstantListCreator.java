import java.util.ArrayList;
import java.util.List;

public class ConstantListCreator implements IntegerListCreator{
    private static final int[] DATA = {1,7,7,2,3};
    @Override
    public List<Integer> create() {
        // [1,7,7,2,3]
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:DATA){
            list.add(i);
        }
        return list;
    }
}
