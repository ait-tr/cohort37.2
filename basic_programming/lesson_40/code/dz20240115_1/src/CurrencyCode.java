public enum CurrencyCode implements Comparable<CurrencyCode>{
    EUR(978),
    USD(840),
    GBP(826);
    private int code;

    CurrencyCode(int code) {
        this.code = code;
    }
}
