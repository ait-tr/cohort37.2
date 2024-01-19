import java.util.Iterator;

public class Temp implements Iterable<Integer>{

    private int counter;

    private int value;

    public Temp(int counter, int value) {
        this.counter = counter;
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorTemp();
    }

    class IteratorTemp implements Iterator<Integer>{
        int innerCounter = counter;
        @Override
        public boolean hasNext() {
            return innerCounter>0;
        }

        @Override
        public Integer next() {
            innerCounter--;
            return value;
        }
    }

    public static void main(String[] args) {
        Temp temp = new Temp(3,121);
        for (Integer i : temp){
            System.out.println(i);
        }
    }


}
