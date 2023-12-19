public class Main {
    public static void main(String[] args) {
        Account account = new AccountFake(new Person("Jack"), "DE12345678");


        account.deposit(100);
        account.withdrawal(100);
        System.out.println(account);

    }
}