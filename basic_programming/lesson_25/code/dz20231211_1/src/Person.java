public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person (String fullName){
        String[] splitName = fullName.split(" ");
        this.firstName = splitName[0];
        this.lastName = splitName[1];
    }
    public String toString(){
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}