import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Дано два списка с Person необходимо получить Set с персонами которые присутствуют и в том и в другом списке
 */
public class Main3 {
    public static void main(String[] args) {
        List<Person> list1 = List.of(
                new Person("Jack",10),
                new Person("Nina",13),
                new Person("Jack",10),
                new Person("John",10)
        );

        List<Person> list2 = List.of(
                new Person("Lena",17),
                new Person("Nina",13),
                new Person("John",10),
                new Person("Lena",17)
        );
        System.out.println(commonList(list1,list2));
    }


    public static Set<Person> commonList(List<Person> list1, List<Person> list2){
        Set<Person> set = new HashSet<>(list1);
        set.retainAll(list2);
        return set;
    }

}
