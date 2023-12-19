public class AccountFake extends Account{
    public AccountFake(Person owner, String iban) {
        super(owner, iban);
    }

    @Override
    public boolean withdrawal(double amount) {
        return true;
    }
}
