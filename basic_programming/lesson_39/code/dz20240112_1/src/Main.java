/*
/*Для примера возьмем класс Student { String name (имя), int missedLessons (количество пропущенных уроков),
     boolean jobcenter (true если финансирование осуществляется через Jobcenter ). Необходимо создать список
     из нескольких студентов. Ваша программа должна предлагать пользователю выбрать режим отображения списка:
- без сортировки
- сортировка по количеству пропущенных уроков (начиная с большего)
- сортировка по длине,  т.е. количеству символов в имени
- *в первую очередь отображаются все кто финансируется через  Jobcenter, потом остальные.

	Подсказка: естественно, для каждого случая необходимо будет реализовать и использовать свой Comparator */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Jack",3,true));
        list.add(new Student("Svetlana",5,true));
        list.add(new Student("Elena",0,false));
        list.add(new Student("John",1,false));
        list.add(new Student("Pavel",0,true));

        System.out.println("--- Исходный список:");
        print(list);

        System.out.println("--- По количеству пропущенных уроков:");


        /*
        Comparator<Student> comp = new ComparatorStudentsByMissedLessons();
        Comparator<Student> comp1=comp.reversed();
        print(list, comp1);
        */
        print(list, new ComparatorStudentsByMissedLessons().reversed());

        System.out.println("--- По длине имени :");
        print(list, new ComparatorStudentsByLengthName());

        System.out.println("--- По признаку JobCenter :");
        print(list, new ComparatorStudentsByJobCenterProp().thenComparing(new ComparatorStudentsByMissedLessons()));

        System.out.println("--- Исходный список:");
        print(list);

    }

    public static void print(List<Student> list){
        for(Student student: list){
            System.out.println(student);
        }
    }

    public static void print(List<Student> list, Comparator<Student> comparator){
        List<Student> copyList = new ArrayList<>(list);

        if (comparator!=null) {
            Collections.sort(copyList, comparator);  //   comparator.reversed() - возвращает обратный компаратор
        }
        print(copyList);

    }



}