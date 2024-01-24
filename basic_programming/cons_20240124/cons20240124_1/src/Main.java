import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println(transformString("hello", new Transform1()));


        MyFunction transform1 = new MyFunction() {
            @Override
            public String apply(String str) {
                return "[" + str + "]";
            }
        };
        String rez1 = transformString("hello2", transform1);
        System.out.println(rez1);

        // ( параметры ) -> {  код   }
        // (String s)-> { return "/" + s +"/"; }

        Function<String,String> trns = (String s)->{ return "{" + s +"}"; };
        String rez2 = transformString("hello3", trns  );
        System.out.println(rez2);
    }

    public static String transformString(String str, MyFunction function){
        return function.apply(str);
    }

    public static String transformString(String str, Function<String,String> function){
        return function.apply(str);
    }
}