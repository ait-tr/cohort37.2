public class Box1 {
    private Object value;

    public Box1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box1{" +
                "value=" + value +
                '}';
    }
}
