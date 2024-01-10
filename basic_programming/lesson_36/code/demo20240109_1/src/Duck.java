public class Duck extends Animal implements Swimable, Runable{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }


    public  void run(){
        System.out.println("Я утка. Я бегаю смешно");
    }



    public  void swim(){
        System.out.println("Я утка. Я хорошо плаваю");
    }

}
