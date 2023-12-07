public class Person {
    private String name;
   private int age;

   private MyDate birthday;

    public Person(String name, int age){
        this.age = isAgeValid(age)? age:0;
        this.name = name;
    }

    public void setAge(int age){
        if (isAgeValid(age)) {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    private boolean isAgeValid(int age){
        return age>0 && age>this.age;
    }


    public  String toString(){
        return  name + " " + age;
    }



}
