import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,7,-2,-7,-3,9,0,8};
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------------");

        //sort(array);
        Arrays.sort(array);

        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(array));

        Person[] people = {
                new Person("Jack",10),
                new Person("John",5),
                new Person("Nick",11),
                new Person("Michail",9),
                new Person("Lena",4)
        };

        sort(people);
        //System.out.println(Arrays.toString(people));

    }

    public static void  sort(int[] array){

        boolean flag = true;
        for (int j = 0; flag  && j < array.length ; j++) {

            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag =true;
                }
            }
            System.out.println(Arrays.toString(array));

        }

    }


    public static void  sort(Person[] array){

        boolean flag = true;
        for (int j = 0; flag  && j < array.length ; j++) {

            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (comparePerson(array[i],array[i + 1])>0) {
                    Person temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag =true;
                }
            }
            System.out.println(Arrays.toString(array));

        }

    }

    public static int comparePerson(Person p1, Person p2){
        return p1.getAge()- p2.getAge();
    }

}