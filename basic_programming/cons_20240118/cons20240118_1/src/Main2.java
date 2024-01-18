import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,3,1,2,5,22,11);
        List<Integer> list2 = List.of(4,1,12,2,5);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(sumList(list1,list2));


    }

    public static List<Integer> sumList(List<Integer> list1, List<Integer> list2){
        List<Integer> result = new ArrayList<>(list1);
        for (int i = 0; i <list2.size() ; i++) {
            Integer el1= list2.get(i);
            if (i<result.size()){
                result.set(i,result.get(i)+el1);
            } else {
                result.add(el1);
            }
        }
        return result;
    }

    public static List<Integer> sumList2(List<Integer> list1, List<Integer> list2){
        int maxSize = Math.max(list1.size(),list2.size());
        List<Integer> result = new ArrayList<>(maxSize);

        for (int i = 0; i < maxSize; i++) {
            result.add(get(list1,i) + get(list2,i));
        }

        return result;
    }
    private static Integer get(List<Integer> list, int index){
        return index<list.size() && index>=0 ? list.get(index):0;
    }

}
