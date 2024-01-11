import java.util.List;

public class IntegerListUtil {
    public static int findMaxValue(List<Integer> list){
        //if (list==null || list.isEmpty())  Exception

        int maxValue = list.get(0);
        for (Integer element: list ){
            if(element>maxValue){
                maxValue = element;
            }
        }
    return maxValue;
    }

    public static int findMinValue(List<Integer> list){
        //if (list==null || list.isEmpty())  Exception

        int minValue = list.get(0);
        for (Integer element: list ){
            if(element<minValue){
                minValue = element;
            }
        }
        return minValue;
    }

    public static long sum(List<Integer> list){
        long sum = 0;
        for (long element:list){
            sum+=element;
        }
        return sum;
    }


}
