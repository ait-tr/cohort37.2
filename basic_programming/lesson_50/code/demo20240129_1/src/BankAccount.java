public class BankAccount {
    private String IBAN;
    private double balance;

    public BankAccount(String IBAN, double balance) {
        this.IBAN = IBAN;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "DE" + IBAN +" " + balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }
}
