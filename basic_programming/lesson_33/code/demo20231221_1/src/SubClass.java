public class SubClass extends SuperClass{
    private int temp;

    public SubClass(int temp) {
        this.temp = temp;
    }
    @Override
    public int getTemp() {
        return temp;
    }
}
