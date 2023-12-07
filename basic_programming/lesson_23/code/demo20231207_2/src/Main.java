public class Main {
    public static void main(String[] args) {

        String name = "Nick";
        int age = 30;
        Person person = new Person(name,age);
        System.out.println(person );
        person.setAge(29);
        System.out.println(person );

        System.out.println("Возраст пользователя " + person.getAge());
        System.out.println(person.getAge()>18? "взрослый":"в школу");

    }
}