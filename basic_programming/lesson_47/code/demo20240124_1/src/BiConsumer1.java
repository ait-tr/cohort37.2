import java.util.function.BiConsumer;

public class BiConsumer1 implements BiConsumer<String,Integer> {
    @Override
    public void accept(String string, Integer integer) {
        System.out.println("key =" +string + " value="+ integer);
    }
}
