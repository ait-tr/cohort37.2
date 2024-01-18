import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

        //System.out.println(intList);


    }
}