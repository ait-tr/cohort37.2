public enum Color1 {

    BLUE("синий",145),
    RED ("красный", 160),
    BLACK("черный",1);

    private String rusTitle;
    private int code;

    Color1(String rusTitle, int code) {
        this.rusTitle = rusTitle;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Color1{" +
                "rusTitle='" + rusTitle + '\'' +
                ", code=" + code +
                '}';
    }

    public String getRusTitle() {
        return rusTitle;
    }

    public int getCode() {
        return code;
    }
}
