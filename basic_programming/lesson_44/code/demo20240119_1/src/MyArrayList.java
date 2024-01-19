import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class  MyArrayList<E> implements MyList<E>
{

    private Object[] array = new Object[10];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public void add(E element) {
        if (size >= array.length){
            enlarge();
        }
        array[size++]= element;
    }

    private void enlarge(){
        Object[] newArray = Arrays.copyOf(array, size*2);
        array=newArray;
    }

    @Override
    public String toString() {
        String res="";
        for (int i=0; i<size; i++){
            res+= array[i]+ "   ";
        }
        return res;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
