public class Dog extends Animal implements Swimable, Runable, Jumpable, RunAndSwimable{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public  void run(){
        System.out.println("Я дог. Я бегу");
    }

    public  void swim(){
        System.out.println("Я дог. Я плаваю, но не далеко");
    }

    public  void jump(){
        System.out.println("Я дог. Я прыгаю, очень высоко");
    }

}
