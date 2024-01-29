/*
Дан список  BankAccount {Person owner, String IBAN, double balance). Класс Person состоит из {String fName, String lName String email)

Используя stream необходимо получить List всех аккаунтов, баланс которых составляет менее 100.

Используя stream необходимо получить set из всех клиентов банка, баланс счета которых превышает 100000;

Используя stream,  сформировать отсортированный по lName лист строк вида “Lennon J.;IBAN: DE19************43;lennon@gmail.com”    (т.е. ФИО; замаскированный счет, в котором открыты только первые 2 и последние 2 символа; email)  для всех клиентов, чей баланс более 100000

Используя stream необходимо получить Map<String, Double>  где ключ - это fName+iName клиента значение - баланс для всех счетов, баланс которых не равен 0

 */

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<BankAccount> bankAccounts = List.of(
                new BankAccount(new Person("John", "Doe", "johndoe@gmail.com"), "DE1234567812345678", 1256.00),
                new BankAccount(new Person("Mary", "Smirnoff", "maryndoe@gmail.com"), "DE1234567898762345", 2385.00),
                new BankAccount(new Person("Inna", "Smith", "innasmith@gmail.com"), "DE1234567865437896", 87.12),
                new BankAccount(new Person("Vera", "Smith", "verasmith@gmail.com"), "DE1234567837463857", 135_286.12),
                new BankAccount(new Person("Katja", "Ivanov", "katjaivanov@gmail.com"), "DE1234567837460365", 53.87),
                new BankAccount(new Person("Oleg", "Petrov", "olegpetrov@gmail.com"), "DE1234567826747561", 347_965.02),
                new BankAccount(new Person("Igor", "Zotov", "zotov@gmail.com"), "DE1234567826747562", 120_965.02),
                new BankAccount(new Person("Nina", "Simon", "nsimon@gmail.com"), "DE1234567826747564", 140_965.02)

        );

        System.out.println("-----------------------   Dataset: ");
        print(bankAccounts);

        // 1.
        System.out.println("\n ---- List всех аккаунтов, баланс которых составляет менее 100");
        List<BankAccount> task1 = bankAccounts.stream()
                .filter(ba -> ba.getBalance() < 100)
                .collect(Collectors.toList());
        print(task1);

        //2
        System.out.println("\n-------------------- set из всех клиентов банка, баланс счета которых превышает 100000 ");
        Set<Person> task2 = bankAccounts.stream()
                .filter(ba -> ba.getBalance() > 100000)
                .map(ba -> ba.getOwner())
                .collect(Collectors.toSet());
        print(task2);

        //3
        Function<BankAccount, String> bankAccountToSecureString = ba -> {
            String iban = ba.getIBAN();
            String email = ba.getOwner().getEmail();
            String name = ba.getOwner().getlName()+ " " + ba.getOwner().getfName().substring(0,1)+".";
            String secureIban= iban.substring(0, 4) + "*".repeat(iban.length() - 6) + iban.substring(iban.length() - 2);
            return  name+";"+secureIban+";"+email;
        };

        System.out.println("\n-------------------- task3 ");
        List<String> task3 = bankAccounts.stream()
                .filter(ba -> { return ba.getBalance() > 100_000;})
                .sorted((ba1, ba2) -> ba1.getOwner().getlName().compareTo(ba2.getOwner().getlName()))
                .map(bankAccountToSecureString)
                .collect(Collectors.toList());
        print(task3);

        //4
        System.out.println("------------ task 4");
        Function<BankAccount, String> keyFunction = (BankAccount ba) -> ba.getOwner().getfName() + " " + ba.getOwner().getlName();
        Map<String, Double> task4 = bankAccounts.stream()
                .filter(ba -> ba.getBalance() != 0)
                .collect(Collectors.toMap(  keyFunction,  ba -> ba.getBalance() ));

        print(task4.entrySet());

        //4a
        /*
        System.out.println("------------ task 4");
        Map<String, Double> task4 = bankAccounts.stream()
                .filter(ba -> ba.getBalance() != 0)
                .collect(Collectors.toMap(  keyFunction,  ba -> ba.getBalance(), ));

        print(task4.entrySet());
        */



    }




    public static <T> void  print(Collection<T> list){
        if(list!=null){
            list.forEach(e-> System.out.println(e));
        }
    }

    /*
    public static  String bankAccountToSecureString (BankAccount ba){
        String iban = ba.getIBAN();
        String email = ba.getOwner().getEmail();
        String name = ba.getOwner().getlName()+ " " + ba.getOwner().getfName().substring(0,1)+".";
        String secureIban= iban.substring(0, 4) + "*".repeat(iban.length() - 6) + iban.substring(iban.length() - 2);
        return  name+";"+secureIban+";"+email;
    };

     */
}