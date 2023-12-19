public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
    @Override
    public double calcArea(){
        return sideA*sideB;
    }
    @Override
    public double calcPerimeter(){
        return 2*(sideB+sideA);
    }


}
