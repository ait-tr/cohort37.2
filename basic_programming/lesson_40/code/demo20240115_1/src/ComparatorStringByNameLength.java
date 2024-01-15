import java.util.Comparator;

public class ComparatorStringByNameLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length()> o2.length()){
            return 975;
        }
        if (o1.length()< o2.length()){
            return -975;
        }
        return 0;
    }
}
