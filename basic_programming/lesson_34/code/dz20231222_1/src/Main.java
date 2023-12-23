/*
Допустим, у вас есть класс Account со следующими полями
String IBAN, double balance, Person client.
Person имеет следующие поля: String firstName, String lastName.
Вам дан массив из Account. Вам необходимо реализовать метод findAccountsByPerson,
который принимает объект Person и выводит на экран все Account принадлежащие данному пользователю.

 */


import model.bank.Account;
import model.bank.Person;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Person findPerson = new Person("fname_1", "lname_1");
        Account findAccount = new Account("DE12345604", findPerson);


        Account[] accounts = {
                new Account("DE12345601", findPerson),
                new Account("DE12345602", new Person("fname_2", "lname_2")),
                new Account("DE12345603", new Person("fname_3", "lname_3")),
                new Account("DE12345604", new Person("fname_1", "lname_1")),
                new Account("DE12345605", new Person("fname_1", "lname_2")),
                new Account("DE12345606", new Person("fname_2", "lname_2")),
        };
        accounts[0].setBalance(1000);

        print(accounts);
        System.out.println("------ find accounts by person -----------");
        findAccountsByPerson(accounts,findPerson);

        System.out.println("------ find account in array  -----------");
        System.out.println(isAccountPresent(accounts,findAccount));

        System.out.println("------ add  -----------");
        addMoney(accounts);
        print(accounts);

    }

    public static void print(Account[] accounts){
        for (Account account: accounts){
            System.out.println(account);
        }
    }

    public static  void findAccountsByPerson(Account[] accounts, Person person){
        for (Account account:accounts){
            if (account.getClient().equals(person)){
                System.out.println(account);
            }
        }
    }

    public static boolean isAccountPresent(Account[] accounts, Account account){
        for (Account acc: accounts){
            if(account.equals(acc)){
                return true;
            }
        }
        return false;
    }

    public static void  addMoney(Account[] accounts){
        Random random = new Random();
        int max = 10;
        int min = -10;

        for (Account account: accounts ){
            int rnd = random.nextInt(max-min+1) + min;                                    // 0 ... 20
            account.setBalance(rnd);
        }
    }


}