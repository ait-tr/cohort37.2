package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        // ( параметры ) -> {  код   }
        System.out.println(transformString("hello", (String s) -> {return s.toUpperCase();}));
        System.out.println(transformString("hello", (String s) -> {return "{" + s + "}"; } ));
        System.out.println(transformString("hello", s ->  "{" + s + "}" ));

        Function<String,String> transform= s ->  "-" + s + "-";
        System.out.println(transformString("hello", transform));

        List<Function<String,String>> list = new ArrayList<>();
        list.add((s)->s.toUpperCase());
        list.add((s)->"(*) - " +s);
        list.add((s)->"[" + s + "]");
        System.out.println(transform("hello", list));



    }

    public static String transformString(String str, Function<String,String> function){
        return function.apply(str);
    }

    public static String transform(String str, List<Function<String,String>> list){
        for(Function<String,String> func: list){
            str = func.apply(str);
        }
        return str;
    }



}


