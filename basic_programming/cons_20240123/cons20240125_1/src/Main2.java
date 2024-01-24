import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Jack","Nickolaus","Ann","John"));

       // class XXComparator001 implements Comparator<String>
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });


        // list.sort((String o1, String o2) -> {return o1.length()-o2.length();});



    }


}
