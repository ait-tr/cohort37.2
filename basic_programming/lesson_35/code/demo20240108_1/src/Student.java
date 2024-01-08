public class Student {
    private     static int  counter  = 0;
    private String name;
    private  MyDate birthday;
    private int id;

    public Student(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
        counter++;
        id=counter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", id=" + id +
                '}';
    }

    public static void count(){
        System.out.println("В программе " + Student.counter + " студентов");

    }

}
