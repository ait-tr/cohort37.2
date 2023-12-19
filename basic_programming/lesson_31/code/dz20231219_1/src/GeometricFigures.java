public abstract class GeometricFigures {
    private int sideA;
    private int sideB;
    private double radius;

    public GeometricFigures(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public GeometricFigures(int sideA) {
        this.sideA = sideA;
    }
    public GeometricFigures(double radius) {
        this.radius = radius;
    }

    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public double getRadius() {
        return radius;
    }
    public abstract void scope();
    public  abstract void area();

}