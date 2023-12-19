/*
* Реализовать в программе классы описывающие геометрические
фигуры: *Круг, Квадрат, Прямоугольник* Подсказка: для того,
что бы задать круг, нужно задать радиус, а для прямоугольника, например,
важны стороны. У каждой фигуры должен быть метод toString(), метод
расчета площади фигуры и метод расчета периметра фигуры.
* В Main необходимо создать массив из фигур и для каждой
фигуры рассчитать площадь и периметр.

 */

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(10.0),
                new Rectangle(10,5),
                new Square(8)
        };

        for (Shape shape:shapes){
            System.out.println(shape);
            System.out.println(shape.calcArea());
            System.out.println(shape.calcPerimeter());
        }

    }
}