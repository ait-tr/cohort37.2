/*
Давайте создадим класс Programmer. Он будет состоять из следующих полей { Person person, String[] listOfTechnologies }
Класс Person содержит всего два поля { String firstName, String lastName }. Необходимо реализовать конструкторы таким образом,
что бы Programmer можно было создать:
* используя объект person и массив технологий: new Programmer(person, new String[]{"Java","Spring Boot","SQL"})
* используя объект person и строке со списком технологий через запятую: new Programmer(person, "Java,Spring Boot,SQL")
* используя строку firstName, строку lastName и  массив технологий: new Programmer("Jack" "Johnson", new String[]{"Java","Spring Boot","SQL"})
* используя строку ФИО (firstName и lastName разделены пробелом) массив технологий: new Programmer("Jack Johnson", new String[]{"Java","Spring Boot","SQL"})

Необходимо создать массив  Programmer и вывести его на экран.


 */


public class Main {
    public static void main(String[] args) {
        String[] aitTech = new String[]{"Java", "Spring Boot", "HTML", "CSS", "JavaScript", "React", "QA"};

        Programmer[] programmers = new Programmer[]{
                new Programmer("Katty Smith",new String[]{"C","C++","Go"}),
                new Programmer(new Person("Jack Hooker"),"C,C++,Go,Java,JavaScript"),
                new Programmer(new Person("John","Polak"),"JavaScript,Java,HTML"),
                new Programmer("Piter","Pen",new String[]{"Java, HTML"}),
                new Programmer(new Person("Jack", "Kave"), aitTech),
                new Programmer(new Person("Oleg", "Nikolaenko"), aitTech)
        };

        System.out.println("------------------- print all -------------- ");
        print(programmers);

        System.out.println("---------------- print by name ------------- ");
        printByName(programmers, "Jack");

        System.out.println("---------------- print by tech ------------- ");
        printByTech(programmers,"Java");



    }

    public static void print(Programmer[] programmers){
        for(Programmer prog : programmers){
            System.out.println(prog);
        }
    }
    public static void printByName(Programmer[] programmers, String name){
        for(Programmer prog : programmers) {
            if (prog.getPerson().getFirstName().equals(name)) {
                System.out.println(prog);
            }
        }
    }
    public static void printByTech(Programmer[] programmers, String tech){
        for(Programmer prog : programmers) {
            if (prog.isSkilled(tech)) {
                System.out.println(prog);
            }
        }
    }
}