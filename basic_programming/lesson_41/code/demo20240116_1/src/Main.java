import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Box1 box1_str = new Box1("qwertyui");
        Box1 box1_integer = new Box1(8);
        Box1 box1_person = new Box1(new Person("Jack", 10));

        ///String temp1 = (String) box1_integer.getValue(); //!!!!  ClassCastException


        Box2<String> box2_str = new Box2<>("qwertyuio");
        Box2<Person> box2_person = new Box2<>(new Person("Jack",19));

        System.out.println(box2_str);
        System.out.println(box2_person);


        Box3<Person> box3_1 = new Box3<>(19,
                                    new Person("Jack",10),
                                    new Person("John",20)
                                );
        System.out.println(box3_1);


        Box4<Person, Integer> box4_1 = new Box4<>(new Person("Jack",15), 15);
        Box4<Person, Integer> box4_2 = new Box4<>(new Person("Lena",20), 20);


        Box4<Integer, String> boxx4_1 = new Box4<>(19,"john");
        Box4<Integer, String> boxx4_2 = new Box4<>(20, "ann");
        Box4<Integer, String> boxx4_3 = new Box4<>(22, "lena");


        List< Box4<Person,Integer>  > list1 = new ArrayList<>();
        list1.add(box4_1);
        list1.add(box4_2);
        //list1.add(boxx4_2);

       List<  Box4<Integer, List<String> >   > list3 = new ArrayList<>();

        Box4<Integer, List<String> >  boxxx4_1 = new Box4<>(10, List.of("qw","qwe1"));
        list3.add(boxxx4_1);

        System.out.println("----------------------------------------------------");

        System.out.println(Temp.isClassEquals("qwet", new Person("Nick", 15)));
        System.out.println(Temp.isClassEquals(11, "sdfghjk"));

        MathBox<Integer, Double> mathBox1 = new MathBox<>(19, 19.8);
        MathBox<Integer, Integer> mathBox2 = new MathBox<>(19, 19);


        List<Integer> listInt = new ArrayList<>(List.of(1,3,-1));
        List<Integer> listInt2 = new ArrayList<>(List.of(1,3,-1, 77,888));
        List<Double> listDouble = new ArrayList<>(List.of(1.0,3.0,-1.1));

        listCopy(listInt, listInt2);



        // Integer is Number  не следует что  List<Integer> is List<Number>
    }

    public static <T1 extends T2,T2> void listCopy(List<T1> list1, List<T2> list2){
        for (T1 element: list1){
            list2.add(element);
        }
    }

/*
List<Integer>  -> List<Integer>   -> List<Number>  ->List<Object>

Person -> Employee -> Programmer ->JavaProgrammer

List<Employee>  ->

 */


// родитель (Р)  потомок (П)  -> List<Р>  можно положить все элементы List<П>
//                            -> List<П>  нельзя положить все элементы List<Р>



}