public class TransactionPredicateByDebitAccount implements TransactionPredicate {

    private String iban;

    public TransactionPredicateByDebitAccount(String debitIban) {
        this.iban = debitIban;
    }

    @Override
    public boolean test(Transaction transaction) {
        return transaction.getAccDebit().getIban().equals(iban);
    }
}
