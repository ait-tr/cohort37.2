import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyLinkedList<>();
        intList.add(10);
        intList.add(21);
        intList.add(9);
        intList.add(13);
        intList.add(8);

        for (int i = 0; i<intList.size(); i++){
            System.out.println(intList.get(i));
        }

        System.out.println("-----------------------------");
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------------------------");
        for (Integer i: intList ){
            System.out.println(i);
        }

        
        
        
        //System.out.println(intList);


        List<Integer> list = List.of(1, 3, 5, 1);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<Integer> integerListIterator = list.listIterator();

    }
}