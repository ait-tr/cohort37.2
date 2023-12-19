public abstract class Account {
    private   Person owner;
    private final String iban;

    private double balance = 0.0;




    public Account(Person owner, String iban) {
        this.owner = owner;
        this.iban = iban;
    }



    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }



    public void deposit(double amount){
        balance += amount;
    }


     
    public final boolean withdrawal(double amount){
        if(amount>=balance){
            balance-=amount;
            return true;
        } else {
            return false;
        }
    }

}
