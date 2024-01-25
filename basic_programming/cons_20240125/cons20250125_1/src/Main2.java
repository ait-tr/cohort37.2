import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(16,9);
/*
        try {
            System.out.println("Max value: " + getMaxValue(list) + " of list: " + list);
        } catch (EmptyDatasetException e){
            System.out.println("невозможно выполнить операцию. Причина: " + e.getMessage());
            System.out.println("Code:" + e.getCode());
        }
*/

        System.out.println("Max value: " + getMaxValue(list) + " of list: " + list);
    }


    public static int getMaxValue(List<Integer> list) throws EmptyDatasetException{
        if (list==null || list.isEmpty()){
           throw new EmptyDatasetException("лист пустой или не задан", (list==null)? 1:2);
        }
        int max =list.get(0);
        for (Integer i:list){
            if (i>max){
                max= i;
            }
        }
        return max;
    }
}

