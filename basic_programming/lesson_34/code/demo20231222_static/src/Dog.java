public class Dog {
    private static int counter = 0 ;
    public static String vid = "Собака ";
    private int id;
    private String name;
    private int age;

    public Dog(String name, int age) {
        id=++counter;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printName(){
        System.out.println(vid + name);
    }

    public  static String getVid() {
        return vid;
    }

    public  static void setVid(String vid) {
        Dog.vid = vid;
    }
}
