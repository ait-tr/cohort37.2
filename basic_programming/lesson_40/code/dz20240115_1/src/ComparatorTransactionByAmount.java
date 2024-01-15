import java.util.Comparator;


public class ComparatorTransactionByAmount implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        if (o1.getAmount()>o2.getAmount()){
            return 1;
        };
        if (o1.getAmount()<o2.getAmount()){
            return -1;
        };
        return 0;
    }
}
