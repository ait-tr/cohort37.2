import java.util.*;

public class Main {
    public static void main(String[] args) {

        //List<String>
        //List<List<String>>
        //Set<Integer>
        //Set< List<Integer> >

        List<String> list   = new ArrayList<>(         );
        List<String> list2 = new ArrayList<>( List.of("15","4","6","22","6","5","15","22","0", "34","22","1","32","9")      );
        Set<String> set = new HashSet<>(  list2    );
        list= new ArrayList<>(set);
        System.out.println(set);
        System.out.println(list);

        //list2 -> to set -> to list


        new ArrayList<>(new HashSet<>(list2));


    }
}