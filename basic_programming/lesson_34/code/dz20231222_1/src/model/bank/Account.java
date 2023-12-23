package model.bank;

import java.util.Objects;

public class Account {
    private final String IBAN;
    private double balance = 0 ;
    private final Person client;

    public Account(String IBAN, Person client) {
        this.IBAN = IBAN;
        this.client = client;
    }


    public Person getClient() {
        return client;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return IBAN +
                ", balance=" + balance +
                ", client=" + client;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!Objects.equals(IBAN, account.IBAN)) return false;
        return Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        int result = IBAN != null ? IBAN.hashCode() : 0;
        result = 31 * result + (client != null ? client.hashCode() : 0);
        return result;
    }
}
