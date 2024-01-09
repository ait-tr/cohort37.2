public enum EnumSingleton {
    INSTANCE("value one");

    private String value;

    EnumSingleton(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
