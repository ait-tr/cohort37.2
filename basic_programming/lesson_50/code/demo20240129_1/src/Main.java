import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = List.of(
                new Client("Jack", List.of(new BankAccount("1", 1))),
                new Client("Nick", List.of(new BankAccount("2", 1), new BankAccount("8", 1))),
                new Client("John", List.of(new BankAccount("3", 1), new BankAccount("4", 1), new BankAccount("5", 1))),
                new Client("Olga", List.of(new BankAccount("6", 1), new BankAccount("7", 1)))
        );

        System.out.println(clients);


        // flatMap()
        // skip()
        // limit()
        System.out.println(clients.stream()
                .flatMap(c -> c.getAccounts().stream())
                .skip(2)
                .limit(3)
                .collect(Collectors.toList()));

        class AccountWithClient{
            private BankAccount account;
            private Client client;

            public AccountWithClient(BankAccount account, Client client) {
                this.account = account;
                this.client = client;
            }

            public BankAccount getAccount() {
                return account;
            }

            public Client getClient() {
                return client;
            }
        }


        //Map<Account, Client>
        System.out.println(clients.stream()
                .flatMap(c -> c.getAccounts().stream().map(a-> new AccountWithClient(a,c)))
                .collect(Collectors.toMap((AccountWithClient ac)->ac.getAccount(), ac->ac.getClient())));


        //flatMap ( Function T -> Stream<T1>  )
        clients.stream()
                .flatMap(c->c.getAccounts().stream()
                                    .map(a->new AccountWithClient(a,c)))
                .collect(Collectors.toList());



    }




}