public class BankAccount {
    private Person owner;
    private String IBAN;
    private double balance;

    public BankAccount(Person owner, String IBAN, double balance) {
        this.owner = owner;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return IBAN +" " + balance + " " + owner;
    }

    public double getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }

    public String getIBAN() {
        return IBAN;
    }
}
