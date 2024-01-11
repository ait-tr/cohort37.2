public class ReverseTransformer implements StringTransformer {
    @Override
    public String transform(String str) {

        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;

    }
}
