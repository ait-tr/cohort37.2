/*
Во вчерашней задаче про Accounts, необходимо сделать следующее:
реализовать печать всех счетов в "безопасном" виде, т.е. вместо  номера смета должно первые 4 символа и последние 2 символа, между ними строка  из \*.
Например:
Счет
Owner: Иван1 Иванов1 (10/10/2010) iban: DE181917161 balance: 10000.0. End of contract: 1/1/2025
выводим как:
Owner: Иван1 Иванов1 (10/10/2010) iban: DE18*****61 balance: 10000.0. End of contract: 1/1/2025
 */


public class Main {

    public static void main(String[] args) {

        /*
        // repeat
        System.out.println("*".repeat(7));
        System.out.println("-".repeat(50));

        // repeat without str.repeat()

        String s="";
        for (int i=0; i<7; i++){
            s+="*";
        }
        System.out.println(s);


        for(s=""; s.length()<7; s+="*");
        System.out.println(s);
        */



        Person person1 = new Person("Иван1", "Иванов1", new MyDate(10,10,2010) );
        Person person2= new Person("Иван2", "Иванов2", new MyDate(1,3,2000) );
        Person person3 = new Person("Иван3", "Иванов3", new MyDate(7,2,2005) );


        // Ctrl+Q  - подсказка


        Account[] accounts = {
                new Account(person1, "DE181917161", 10_000.00, new MyDate(1, 1, 2025)),
                new Account(person2, "DE1819787817162", 11_000.00, new MyDate(1, 2, 2025)),
                new Account(person3, "DE181917163", 12_000.00, new MyDate(1, 3, 2025))
        };





        Accounts bankAccounts = new Accounts(accounts);
        bankAccounts.setSecure(false);
        System.out.println(bankAccounts);

        System.out.println("----------------------------------------------------------");

        bankAccounts.printAccountsWithSmallerBalance(12_000.00);
        System.out.println(bankAccounts.sumAllBalances());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        Account account = new Account(person1, "DE181917161", 10_000.00, new MyDate(1, 1, 2025));
        System.out.println(account);
        account.setBalance(200);
        //account.balance=-100;

        System.out.println(account);
        //account.iban="wqeyt";   // error!!
        System.out.println(account);
        System.out.println(person1);
        person1.changeLastName("Sergeev");
        System.out.println(person1);



    }
}