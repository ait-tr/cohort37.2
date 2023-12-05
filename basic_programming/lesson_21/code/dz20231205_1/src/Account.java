
// owner (владелец), iban (номер счета), balance, dateOfContract (дата истечения контракта)
public class Account {
    Person owner;
    String iban;
    double balance;
    MyDate dateOfContract;

    public  Account (Person owner, String iban, double balance, MyDate dateOfContract){
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
        this.dateOfContract = dateOfContract;
    }

    public  String toString(){
        return "Owner: " + owner + " iban: " + iban + " balance: " + balance + ". End of contract: " + dateOfContract;
    }

}
