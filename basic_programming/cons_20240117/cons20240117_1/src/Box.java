import java.util.Comparator;

public class Box<T extends Comparable<T>> {
    private T value1;
    private T value2;

    public Box(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    public  int compare(){
        return value1.compareTo(value2);
    }

    public  void printCompareResult(){
        int compareRes= compare();
        if (compareRes>0) {
            System.out.println("Object: " + value1 + " больше чем " + "Object: " + value2);
        } else if (compareRes<0) {
            System.out.println("Object: " + value2 + " больше чем " + "Object: " + value1);
        } else {
            System.out.println("равны");
        }
    }

}
