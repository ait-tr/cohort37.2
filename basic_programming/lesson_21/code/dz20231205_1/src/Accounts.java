public class Accounts {


    Account[] accounts;



    public Accounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public String toString() {
        String result = "";
        for (Account acc : accounts) {
            result = result + acc + System.lineSeparator();
        }
        return result;
    }

    public void printAccountsWithSmallerBalance(double limit) {
        for (Account acc : accounts) {
            if (acc.balance < limit) {
                System.out.println(acc);
            }
        }
    }

    public double sumAllBalances() {
        double sum = 0;

        for (Account acc : accounts) {
            sum += acc.balance;
        }

        return sum;
    }
}
