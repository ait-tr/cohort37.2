import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=10;
        //System.out.println(i++ - ++i);
        int[] array = {++i, i++, i=i+1, i};// {11, 11, 13, 12}


        Box<String> box = new Box<>("asdfg", "qwer");
        Box<Integer> box1 = new Box<>(2, 5);
        Box<Person> box2 = new Box<>(new Person("Jack",6), new Person("Lena",8) );
        box.printCompareResult();
        box1.printCompareResult();
        box2.printCompareResult();


        compare("asdfg", "qwer");
        compare(2, 5);
        compare(new Person("Jack",6), new Person("Lena",8) );


    }


    public static <T extends Comparable<T>> void compare(T str1, T str2){
        System.out.println(str1.compareTo(str2));
    }
    public static <T> void compare(T str1, T str2 , Comparator<T> comparator){
        System.out.println(comparator.compare(str1, str2));
    }

}