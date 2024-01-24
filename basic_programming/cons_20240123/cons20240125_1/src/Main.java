import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> str = null;
        System.out.println("Size:" +temp(str).size());
        for (String s : temp(str)){
            System.out.println(s);
        }
    }

    public static List<String> temp(List<String> str){
        if (str==null || str.isEmpty()) {
            return Collections.EMPTY_LIST;
        } else {
            // обработчик
            return str;
        }
    }

}


