public class Rectangle extends GeometricFigures{
    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }
    public void scope(){
        System.out.println("Scope: ");
        System.out.println((2 * getSideA()) + (2 * getSideB()));
    }
    public void area(){
        System.out.println("Area: ");
        System.out.println(getSideA() * getSideB());
        System.out.println("-".repeat(100));
    }
    public String toString(){
        return "Rectangle: ";
    }
}