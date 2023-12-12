/*
Реализовать класс в котором в качестве NamesHandler.
В нем должно быть одно поле String[] names - которое содержит массив имен.
Реализовать два конструктора
* конструктор, который принимает массив с именами
* конструктор, который принимает строку, разделенную ','

Реализовать следующие методы:
* toString
* toStringByLength - все имена заданной длинны
* toStringByStartWith - все имена начинающиеся на заданный символ

 */


public class Main {
    public static void main(String[] args) {

        /*
         String str ="hello world!";
         System.out.println(str.endsWith("!"));
        */

        String[] names = new String[]{"Jack", "Nick", "Jacky"};
        //String[] names = new String[]{};

        NamesHandler handler1 = new NamesHandler(names);
        NamesHandler handler2 = new NamesHandler("Ron,Rick,Oleg,Klod,Jan");

        System.out.println(handler1);
        System.out.println(handler2);

        System.out.println(handler2.toStringByLength(8));
        System.out.println(handler2.toStringByStartWith('R'));




    }
}

/*
        // persons[0].getFirstNane()
        // persons[persons.length-1].getBirthday().getYear()
        // autos[i].getOwner().setName("Jack");
        // auto.getOwners()[0].getName();
        // auto.  owners[0]   .getName();
        // auto.owner.firstName;
 */