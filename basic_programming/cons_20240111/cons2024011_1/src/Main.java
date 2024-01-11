import java.util.ArrayList;
import java.util.List;

/*
[]
()
String -> gnirtS
*/
public class Main {
    public static void main(String[] args) {
        String str ="Hello world!";

        String str1 = transform(str, new AddBracketTransformer());
        System.out.println(str1);

        System.out.println(transform(str, new ReverseTransformer()));

        List<StringTransformer> transformers = new ArrayList<>();

        transformers.add(new ReverseTransformer());
        transformers.add(new AddBracketTransformer());
        transformers.add(new AddParenthesesTransformer());
        transformers.add(new AddBracketTransformer());

        System.out.println(transform(str,transformers));
    }

    public static String transform(String str, StringTransformer transformer){
        return transformer.transform(str);
    }

    public static String transform(String str, List<StringTransformer> transformers){
        for (StringTransformer transformer: transformers){
            str = transformer.transform(str);
        }
        return str;
    }

}
