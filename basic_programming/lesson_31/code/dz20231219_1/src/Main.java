public class Main {
    public static void main(String[] args) {
        /*
        Реализовать в программе классы описывающие геометрические фигуры: Круг, Квадрат, Прямоугольник Подсказка:
        для того, что бы задать круг, нужно задать радиус, а для прямоугольника, например, важны стороны.
        У каждой фигуры должен быть метод toString(), метод расчета площади фигуры и метод расчета периметра фигуры.
        В Main необходимо создать массив из фигур и для каждой фигуры рассчитать площадь и периметр.
         */

        Rectangle r1 = new Rectangle(2,4);
        Rectangle r2 = new Rectangle(5,8);
        Square s1 = new Square(4);
        Square s2 = new Square(6);
        Circle c1 = new Circle(4);
        Circle c2 = new Circle(8);



        GeometricFigures[] geometricFigures = {r1, r2, s1, s2, c1, c2};



        for (GeometricFigures geometricFigure : geometricFigures){
            System.out.println(geometricFigure.toString());
            geometricFigure.scope();
            geometricFigure.area();

        }
    }
}