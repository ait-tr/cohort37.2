public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calcArea(){
        return Math.PI*Math.pow(radius,2);

    }
    @Override
    public double calcPerimeter(){
        return 2*Math.PI*radius;
    }

}
