import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        List<FrontEndProgrammer> list = new ArrayList<>();
        //print(list);
        FrontEndProgrammer[] array = new FrontEndProgrammer[10];
        print(array);

        /*
            Programmer <- Employee
            List<Programmer> не наследует List<Employee> - инвариантность

            Если бы List<Programmer> наследовал List<Employee> (что не так!) - ковариантность
            Если бы List<Employee> наследовал List<Programmer> (что не так!) - контрвариантность

         */

        List<Programmer> list1 = new ArrayList<>();
        List<Employee> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();

        copy(list2, list4);

        add(new Programmer("Nick",2000), list4);


    }

    public static <T> void copy(List<? extends T > source, List<? super T> target){
        for (T elemen: source){
            target.add(elemen);
        }
    }

    public static <T> void add(T el, List<? super T> target){
        target.add(el);
    }

    public static void print(List<Programmer> list){

    }

    public static void print(Programmer[] array){

    }




}
