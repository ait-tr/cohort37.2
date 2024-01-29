import java.util.List;

public class Client {
    private String name;
    List<BankAccount> accounts;

    public Client(String name, List<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return name + " " + "  accounts=" + accounts +
                '\n';
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
