public class Person {
    private String firstName;
    private String lastName;
    private MyDate birthday;

    public Person(String firstName, String lastName, MyDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" +  birthday +")";
    }

    public MyDate getBirthday() {
        return birthday;
    }
}
