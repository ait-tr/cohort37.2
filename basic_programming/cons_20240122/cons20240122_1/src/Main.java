import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,2,6,3,7);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Integer i:list){
            System.out.println(i);
        }
        //  -------------------------------
        System.out.println("List");
        ListIterator<Integer> integerListIterator = list.listIterator(list.size()/2);
        while (integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }
        System.out.println("List reversed");
        while (integerListIterator.hasPrevious()){
            System.out.println(integerListIterator.previousIndex() +". " + integerListIterator.previous());
        }


    }
}