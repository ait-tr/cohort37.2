public class AddParenthesesTransformer implements StringTransformer{
    @Override
    public String transform(String str) {
        return  "(" + str + ")";
    }
}
