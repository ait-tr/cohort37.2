public class Auto {
    private String model;
    private String number;
    private MyDate dateOfFirstRegistration;
    private Person owner;

    public Auto(String model, String number, MyDate dateOfFirstRegistration, Person owner) {
        this.model = model;
        this.number = number;
        this.dateOfFirstRegistration = dateOfFirstRegistration;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", dateOfFirstRegistration=" + dateOfFirstRegistration +
                ", owner=" + owner +
                '}';
    }

    public Person getOwner() {
        return owner;
    }
    public int getYear(){
        return dateOfFirstRegistration.getYear();
    }
    public int getOwnerBirthdayYear(){
        return this.owner.getBirthday().getYear();
    }
}
