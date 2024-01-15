public class TransactionPredicateByCreditAccount implements TransactionPredicate{
    private String iban;

    public TransactionPredicateByCreditAccount(String creditIban) {
        this.iban = creditIban;
    }

    @Override
    public boolean test(Transaction transaction) {
        return transaction.getAccCredit().getIban().equals(iban);
    }
}
