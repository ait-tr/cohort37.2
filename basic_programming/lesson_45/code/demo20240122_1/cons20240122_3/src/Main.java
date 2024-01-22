import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "программирование помогает развить сильные навыки решения проблем Это поощряет логическое мышление и аналитические рассуждения решения поскольку вы разбиваете сложные решения проблемы на более мелкие более управляемые части";

        System.out.println("Количество слов: " + countWords(str));
    }

    public static int countWords(String str){
        /*
        String[] split = str.split(" ");
        List<String> list = Arrays.asList(split);
        Set<String> set = new HashSet<>(list);
        return set.size();

         */
        return        new HashSet<>(Arrays.asList(str.split(" "))).size();
    }

    public static int countWords1(String str){
        return  getSet(str).size();
    }

    public static Set<String> getSet(String str){
        HashSet<String> set = new HashSet<>();

        for (String word: strToArrayWords(str)){
            set.add(word);
        }
        return set;
    }

    public static String[] strToArrayWords(String str){
        return str.split(" ");
    }

}