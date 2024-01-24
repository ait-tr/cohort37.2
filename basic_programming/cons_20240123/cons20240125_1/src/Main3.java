import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Set<List<Integer>> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        set.add(List.of(1,2,3));
        set.add(List.of(2,1,3));
        set.add(list);

        System.out.println(set);


        Set<List<Temp>> set1=new HashSet<>();

        set1.add(List.of(new Temp(1),new Temp(3)));
        set1.add(List.of(new Temp(1),new Temp(3)));
        System.out.println(set1);

    }

}
