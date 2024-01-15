public class TransactionPredicateByCurrency implements TransactionPredicate{
    private CurrencyCode currencyCode;

    public TransactionPredicateByCurrency(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean test(Transaction transaction) {
        return transaction.getCurrencyCode().equals(currencyCode);
    }
}
