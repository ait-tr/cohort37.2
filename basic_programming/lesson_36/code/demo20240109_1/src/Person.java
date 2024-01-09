public class Person implements Swimable, Runable, Jumpable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public  void run(){
        System.out.println("Я человек. Я бегу");
    }

    public  void swim(){
        System.out.println("Я человек. Я плаваю, но не далеко");
    }

    public  void jump(){
        System.out.println("Я человек. Я прыгаю, но не высоко");
    }

}
