public class Accounts {


    private Account[] accounts;
    private boolean isSecure;


    public void setSecure(boolean secure) {
        isSecure = secure;
    }

    public Accounts(Account[] accounts) {
        this.accounts = accounts;
        isSecure = true;
    }
    public String accountToString(Account acc){
        return isSecure ? acc.toSecureString(): acc.toString();
    }


    public String toString() {
        String result = "";
        for (Account acc : accounts) {
            result = result + accountToString(acc) + System.lineSeparator();
        }
        return result;
    }


    public void printAccountsWithSmallerBalance(double limit) {
        for (Account acc : accounts) {
            if (acc.getBalance() < limit) {
                System.out.println(accountToString(acc));
            }
        }
    }

    public double sumAllBalances() {
        double sum = 0;

        for (Account acc : accounts) {
            sum += acc.getBalance();
        }

        return sum;
    }
}
