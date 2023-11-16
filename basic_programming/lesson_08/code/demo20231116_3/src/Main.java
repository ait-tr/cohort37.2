public class Main {


    public static void main(String[] args) {
        System.out.println("площадь круга с радиусом 12 =" + methodCalcArea(12));
        System.out.println("площадь круга с радиусом 89 =" + methodCalcArea(89));
    }

    public static double methodCalcArea(int radius){
        double area = radius*radius*3.14;
        return area;
    }

}