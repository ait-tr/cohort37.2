import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Area of circle with radius 5 is " + getCircleArea(5));
        System.out.println("Area of circle with radius 7 is " + getCircleArea(7));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the circle radius: ");
        int r = scanner.nextInt();

        System.out.println("Area of circle with radius " + r + "  is " + getCircleArea(r));

// ------ Rectangle
        int side1 = 5;
        int side2 = 4;
        printRectangle(side1,side2, getRectangleArea(side1, side2) );
        // Area of rectangle (*,*) is *


        side1 = 9;
        side2 = 2;
        printRectangle(side1,side2, getRectangleArea(side1, side2) );


    }

    public static void  printRectangle(int side1, int side2, int area){
        System.out.println();
        System.out.println("Rectangle: side1: "+ side1 + " side2: "+ side2);
        System.out.println("Area of rectangle  is: " + area);
    }

    public static double getCircleArea(int radius) {

        return radius * radius * 3.1415;
    }

    public static int getRectangleArea(int side1, int side2) {
        return side1 * side2;
    }

}