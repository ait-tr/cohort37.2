public class Main {
    public static void main(String[] args) {
        Person[] people ={
                new Person("Jack", 10),
                new Person("John", 23),
                new Person("Svetlana", 18, new int[]{110,130,150}),
                new Person("Igor", 25),
                new Person("Sam", 17, new int[]{120,124,110}),
                new Person("Jack", 19, new int[]{110,130})
        };

        print(people);
        System.out.println("---------- print Names----------");
        printNames(people);
        System.out.println("---------- printStartWith ----------");
        printStartWith(people,"J");
        System.out.println("---------- printAge ----------");
        printPersonWithAge(people,17);

        System.out.println("------------ printNamesOfPersonWithoutArray ---------------");
        printNamesOfPersonWithoutArray(people);

        System.out.println("---------------- sumOfAge ------------------");
        System.out.println(sumOfAge(people));

        System.out.println("------------- avgNamesLength -------------");
        System.out.println(avgNamesLength(people));

        System.out.println("------------- countPersonByAge -----------");
        System.out.println(countPersonByAge(people,20));

        System.out.println("------------- namesOfHippertonick ----------" );
        System.out.println(namesOfHippertonick(people,125));


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


    public static  void  printNamesOfPersonWithoutArray(Person[] people){
        for (Person person:people){
            int[] array = person.getArray();
            if (array==null || array.length==0){
                System.out.println(person.getName());
            }
        }
    }

    public  static  int sumOfAge(Person[] people){
        int sum=0;
        for (Person person:people){
            sum = sum + person.getAge();
        }
        return sum;
    }

    public static  double avgNamesLength(Person[] people){
        double sum = 0.0;
        if (people.length==0) {
            return 0;
        }
        for (Person person:people){
            sum = sum + person.getName().length();
        }
        return sum/people.length;
    }

    public static int countPersonByAge(Person[] people, int ageLimit){
        int counter = 0;
        for (Person person: people){
            if (person.getAge()>ageLimit){
                counter++;
            }
        }
        return counter;
    }

    public static String namesOfHippertonick2(Person[] people, int limit){
        String res="";
        for (Person person: people){
            int[] array = person.getArray();
            if (array!=null) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > limit) {
                        res +=  person.getName() + " ";
                        break;
                    }
                }
            }
        }
       return res;
    }


    public static String namesOfHypertonic(Person[] people, int limit){
        String res="";
        for (Person person: people){
            int[] array = person.getArray();
            if (isHighValue(array,limit)){
                res +=  person.getName() + " ";
            }
        }
        return res;
    } 

    public static boolean isHighValue(int[] array, int limit){
        if (array==null){
            return false;
        }
        for (int value : array ){
            if(value>limit){
                return true;
            }
        }
        return false;
    }




}