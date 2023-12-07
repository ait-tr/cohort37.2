// owner (владелец), iban (номер счета), balance, dateOfContract (дата истечения контракта)
public class Account {
    private Person owner;
    private String iban;
    private double balance;
    private MyDate dateOfContract;

    public  Account (Person owner, String iban, double balance, MyDate dateOfContract){
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
        this.dateOfContract = dateOfContract;
    }

    public  String toString(){
        return "Owner: " + owner + " iban: " + iban + " balance: " + balance + ". End of contract: " + dateOfContract;
    }

    public  String toSecureString(){
        // DE123501751 -> DE12*****51
        // DE1256
        return "Owner: " + owner
                + " iban: " + (iban.length()>6 ? secureIban() : iban)
                + " balance: " + balance
                + ". End of contract: " + dateOfContract;
    }

    private String secureIban(){
        String res="";
        for (int i = 0; i< iban.length(); i++){
            if(i<4 || i> iban.length()-3) {
                char ch = iban.charAt(i);
                res += ch;
            } else {
                res+="*";
            }
        }
        return res;
    }

    private String secureIban2(){
        return iban.substring(0,4)
                + "*".repeat(iban.length()-6)
                + iban.substring(iban.length()-2);
    }

    public void setBalance(double balance){
        if (balance>=0){
            this.balance = balance;
        }
    }

    public  double getBalance(){
        return balance;
    }

    public String getIban(){
        return iban;
    }


}
