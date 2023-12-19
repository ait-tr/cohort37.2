public class Square extends GeometricFigures{
    public Square (int sideA) {
        super(sideA);
    }
    public void scope(){
        System.out.println("Scope: ");
        System.out.println(4*getSideA());
    }
    public void area(){
        System.out.println("Area: ");
        System.out.println(getSideA() * getSideA());
        System.out.println("-".repeat(100));
    }
    public String toString(){
        return "Square: ";
    }
}