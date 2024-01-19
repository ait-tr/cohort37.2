import java.util.List;
import java.util.Random;

public class ListCreator {
    public static final int SIZE = 500_000;
    public static final int MIN_VALUE = -100_000;
    public static final int MAX_VALUE = 100_000;
    public static final Random rnd = new Random();


    public static void fillIntegerList(List<Integer> list){
        for (int i = 0; i < SIZE; i++) {
            list.add(0, getRandomInteger(MIN_VALUE, MAX_VALUE));
        }
    }

    public static void fillIntegerList(List<Integer> list, boolean flagAddToRandomPosition){
        if(!flagAddToRandomPosition){
            fillIntegerList(list);
            return;
        }
        list.add(getRandomInteger(MIN_VALUE, MAX_VALUE));

        for (int i = 0; i < SIZE; i++) {
            int listSize= list.size();
            int pos = getRandomInteger(0, listSize);  // [0 ...size]
            Integer value = getRandomInteger(MIN_VALUE, MAX_VALUE);
            if(pos==listSize){
                list.add(value);
            } else {
                list.add(pos,value);
            }
        }
    }

    private static Integer getRandomInteger(int min, int max){
        return rnd.nextInt(max-min+1) + min;
    }


}
