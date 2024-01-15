public class Transaction implements Comparable<Transaction> {
    private static int counter = 0;

    private int id;
    private Account accDebit;
    private Account accCredit;
    private double amount;
    private CurrencyCode currencyCode;


    public Transaction(Account accDebit, Account accCredit, double amount, CurrencyCode currencyCode) {
        counter++;
        this.id = counter;
        this.accDebit = accDebit;
        this.accCredit = accCredit;
        this.amount = amount;
        this.currencyCode = currencyCode;
    }


    @Override
    public String toString() {
        return id +
                ". " + accDebit +
                " " + accCredit +
                " " + amount +
                "(" + currencyCode +
                ')';
    }

    @Override
    public int compareTo(Transaction o) {
        return o.id - this.id;
    }

    public double getAmount() {
        return amount;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public Account getAccDebit() {
        return accDebit;
    }

    public Account getAccCredit() {
        return accCredit;
    }
}




