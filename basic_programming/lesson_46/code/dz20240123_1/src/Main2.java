import java.util.*;

/*
Дана строка с именами вида Jack,John,Nick,John. Необходимо написать метод, который удалит из этой строки повторяющиеся имена. Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick
 */
public class Main2 {
    public static void main(String[] args) {
        String str = "Jack,John,Nick,John";
        System.out.println(nameSetToString(nameStringToSet(str)));
    }

    public static Set<String> nameStringToSet(String str){
        /*
        String[] array = str.split(",");
        List<String> list = Arrays.asList(array);
        Set<String> set = new HashSet<>(list);
        return set;
        */

        return  new LinkedHashSet<>(Arrays.asList(str.split(",")));
    }



    public static String nameSetToString(Set<String> set){
        return String.join(",", set);
    }

   // не очень правильно
    public static String nameSetToString2(Set<String> set){
        String string = set.toString();
        return string.substring(1,string.length()-1);
    }



}
