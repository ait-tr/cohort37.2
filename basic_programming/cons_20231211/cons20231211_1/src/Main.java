public class Main {
    public static void main(String[] args) {

        MyDate date1= new MyDate(10,10,1990);
        Person p1 = new Person("Ivan", "Ivanov", date1);
        Person p2 = new Person("Sergey", "Sergeev", new MyDate(14,11,2000));
        Person p3 = new Person("Aleksandr", "Aleksandrov", today());
        Person[] people = new Person[]{p1,p2,p3,
            new Person("Vasiliy", "Pupkin", new MyDate(13,12,2000)),
            new Person("Lena", "Lenina", new MyDate(1,1,1995)),
        };

        for (Person p : people ){
            System.out.println(p);
        }

        for (Person p : people){
            System.out.println(p.getBirthday());
        }

        for (Person p : people){
            System.out.println(p.getBirthday().getYear());
        }

        //people[1].getBirthday().getYear()
        Person tempPerson = people[1];
        MyDate tempDate = people[1].getBirthday();
        int tempYear = people[1].getBirthday().getYear();

        System.out.println("-------------------------------------------------------");
        Auto auto1 = new Auto(  "Audi",
                                "112233",
                                new MyDate(1,1,2023),
                                new Person("Grag",
                                           "Gragson",
                                            new MyDate(3,3,1978)
                                           )
                            );

        Auto auto2 = new Auto(  "BMW",
                "112244",
                new MyDate(1,1,2022),
                new Person("Olga",
                        "Jackson",
                        new MyDate(13,3,1987)
                )
        );

        System.out.println(auto1);
        int ownerAge = 2023 - auto1.getOwner().getBirthday().getYear();
        System.out.println(ownerAge);

        Auto[] autos = new Auto[]{auto1,auto2};
        //autos[0].getOwner().getBirthday().getYear()

        for (Auto a : autos){
            int ownerYear = a.getOwner().getBirthday().getYear();
            
            if (ownerYear == 1987){
                System.out.println(a);
            }
        }

    }

    public static MyDate today(){
        return new MyDate(11,12,2023);
    }



}