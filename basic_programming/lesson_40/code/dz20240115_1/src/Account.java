public class Account {
    private String iban;
    private Person owner;

    public Account(String iban, Person owner) {
        this.iban = iban;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return iban + "(" + owner + ')';
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }
}
