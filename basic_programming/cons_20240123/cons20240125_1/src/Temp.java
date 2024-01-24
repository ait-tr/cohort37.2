public class Temp {
    private int a;

    public Temp(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Temp:" + a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Temp temp = (Temp) o;

        return a == temp.a;
    }

    @Override
    public int hashCode() {
        return a;
    }
}
