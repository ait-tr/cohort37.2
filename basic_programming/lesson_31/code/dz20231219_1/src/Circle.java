public class Circle extends GeometricFigures{
    private double pi = 3.14;
    public Circle(double radius){
        super(radius);
    }
    public void scope(){
        System.out.println("Scope: ");
        System.out.println(getRadius() + getRadius() * pi);
    }
    public void area(){
        System.out.println("Area: ");
        System.out.println(getRadius() * getRadius() * pi);
        System.out.println("-".repeat(100));
    }
    public String toString(){
        return "Circle: ";
    }
}