public class AddBracketTransformer implements StringTransformer{
    @Override
    public String transform(String str) {
        return  "[" + str + "]";
    }
}
