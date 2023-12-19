public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
    @Override
    public double calcArea(){
        return side*side;
    }
    @Override
    public  double calcPerimeter(){
        return side*4;
    }

}
