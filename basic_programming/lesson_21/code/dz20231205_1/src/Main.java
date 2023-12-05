/*
Создать класс Account (счет). У сета должны быть следующие поля owner (владелец), iban (номер счета), balance, dateOfContract (дата истечения контракта). Owner - сам по себе класс (firstName, lastName, birthday) Для отражения дат используем класс MyDate созданный ранее. В каждом классе должен быть конструктор и метод toString.

создайте класс Accounts который должен управлять всеми счетами. Кроме метода toString в этом классе должны быть методы:

метод, который выводит на экран все счета, с балансом меньше заданного числа
метод, который считает сумму всех остатков, на всех счетах банка
 */


public class Main {

    public static void main(String[] args) {


        Person person1 = new Person("Иван1", "Иванов1", new MyDate(10,10,2010) );
        Person person2= new Person("Иван2", "Иванов2", new MyDate(1,3,2000) );
        Person person3 = new Person("Иван3", "Иванов3", new MyDate(7,2,2005) );


        // Ctrl+Q  - подсказка


        Account[] accounts = {
                new Account(person1, "DE181917161", 10_000.00, new MyDate(1, 1, 2025)),
                new Account(person2, "DE181917162", 11_000.00, new MyDate(1, 2, 2025)),
                new Account(person3, "DE181917163", 12_000.00, new MyDate(1, 3, 2025))
        };


        Accounts bankAccounts = new Accounts(accounts);
        System.out.println(bankAccounts);

        System.out.println("----------------------------------------------------------");

        bankAccounts.printAccountsWithSmallerBalance(12_000.00);
        System.out.println(bankAccounts.sumAllBalances());




    }
}