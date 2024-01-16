public class MathBox <T1 extends Number, T2 extends Number> {
    private T1 value1;
    private T2 value2;

    public MathBox(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void printSub(){
        System.out.println(value1 + " - " + value2 + " = " + (value1.doubleValue()-value2.doubleValue()));
    }
}
