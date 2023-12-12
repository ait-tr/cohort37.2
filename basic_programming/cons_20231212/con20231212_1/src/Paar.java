public class Paar {
    Person student1;
    Person student2;

    public Paar(String student1, String student2) {
        this.student1 = new Person(student1);
        this.student2 = new Person(student2);
    }

    @Override
    public String toString() {
        return  student1 + " - " +  student2;
    }

    public  void changeFirstStudentName(String name){
        student1.setName(name);
    }
    public  void changeSecondStudentName(String name){
      student2.setName(name);
    }
}
