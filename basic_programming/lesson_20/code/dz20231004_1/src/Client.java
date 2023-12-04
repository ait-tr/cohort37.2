public class Client {
    String firstName;
    String lastName;
    int age;
    Auto auto;

    public Client(String firstName, String lastName, int age, Auto auto) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Client{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", favorite auto=" + auto +
                '}';
    }
}
