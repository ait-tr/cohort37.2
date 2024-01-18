import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("str1");
        list.add("str2");
        list.add("hello1");
        list.add("jack");

        String str1 = list.get(2);
        System.out.println(str1);

        int indexStr2 = list.indexOf("st");
        System.out.println(indexStr2);



        System.out.println(list);
        list.add(0, "the first");
        System.out.println(list);

        List<Person> listPerson = new LinkedList<>();
        Person olga = new Person("Olga", 12);
        listPerson.add(new Person("Jack",10));
        listPerson.add(new Person("Lena",6));
        listPerson.add(new Person("Olga", 12));
        listPerson.add(new Person("Vlad",8));

        System.out.println(listPerson);

        int indexOlga = listPerson.indexOf(new Person("Olga", 12));
        System.out.println(indexOlga);

        list.add("str2");
        list.add("str2");
        list.add("str2");
        list.add("qwe");
        System.out.println(list);
        remove4(list,"str2");
        System.out.println(list);


        System.out.println("-----------------------------------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*
        for (String str: list){

        }

         */
    }


    public static void  remove1(List<String> list, String deletedElement){
        for (int i=0; i<list.size(); i++ ){
            if (list.get(i).equals(deletedElement)){
                list.remove(i);
            }
        }
    }

    public static void  remove2(List<String> list, String deletedElement){
        for (String str: list ){
            if (str.equals(deletedElement)){
                list.remove(str);
            }
        }

    }

    public static void  remove3(List<String> list, String deletedElement){
        List<String> newList = new ArrayList<>(list.size());
        for (String str: list ){
            if (!str.equals(deletedElement)){
                newList.add(str);
            }
        }
        list = newList;
    }

    public static void  remove4(List<String> list, String deletedElement){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(deletedElement)){
                iterator.remove();
            }
        }
    }

}