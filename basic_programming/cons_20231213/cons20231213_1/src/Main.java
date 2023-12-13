public class Main {
    public static void main(String[] args) {
        Person[] people ={
                new Person("Jack", 10),
                new Person("John", 23),
                new Person("Svetlana", 18),
                new Person("Igor", 25),
                new Person("Sam", 17),
                new Person("Jack", 19)
        };

        print(people);
        System.out.println("---------- print Names----------");
        printNames(people);
        System.out.println("---------- printStartWith ----------");
        printStartWith(people,"J");
        System.out.println("---------- printAge ----------");
        printPersonWithAge(people,17);


    }

    public static void print(Person[] people){
        /*
        for (int i = 0; i<people.length; i++){
            Person person = people[i];
        }
         */
        for (Person person: people){
            System.out.println(person);
        }
    }

    public static  void  printNames(Person[] people){
        for (Person person: people){
            System.out.println(person.getName());
        }
    }
    public static  void  printPersonIntArray(Person[] people){
        for (Person person: people){
            int[] arr = person.getArray();
            for (int element : arr){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }


    public static void printStartWith(Person[] people, String prefix){
        for (Person person: people){
            if (person.getName().startsWith(prefix)) {
                System.out.println(person);
            }
        }
    }

    public static void printPersonWithAge(Person[] people, int age){
        for (Person person: people){
            if (person.getAge()==age) {
                System.out.println(person);
            }
        }
    }



}