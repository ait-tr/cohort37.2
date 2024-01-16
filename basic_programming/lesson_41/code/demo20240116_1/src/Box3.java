public class Box3<T>  {

    int intValue;
    private T value;
    private T value2;


    public Box3(int intValue, T value, T value2) {
        this.intValue = intValue;
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Box3{" +
                "value1=" + value + " (" + value.getClass().getSimpleName() +")" +
                "value2=" + value2 + " (" + value2.getClass().getSimpleName() +")" +
                '}';
    }
}
