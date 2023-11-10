public class Main5 {
    public static void main(String[] args) {

        //Написать программу которая в качестве данных имеет диаметр пиццы. Необходимо, что бы ваша программа расчтывала площадь пиццы (вспомтнаем плщадь круга)
        //Определите с помощью вашей программы, что выгоднее покупать: одну большую пиццу (48 сm) - 15 евро или 2 средних пицци (22 см) -7 евро.;
        // S= 3,14 * r^2
        // S= 3,14 * (r*r)

        int diameter = 52;
        double pi = 3.1415;

/// ----------------------------------------------
        double radius1 = diameter*0.5;
        double sqare = pi * (radius1*radius1);

/// ----------------------------------------------

        System.out.println("пицца с диаметром: " + diameter);
        System.out.println( "имеет площадь = " + sqare );
////// ------------------------------------------
        //pi=3.1415;

        diameter = 22;
        radius1 = diameter*1.0/2;
        System.out.println(radius1);
        System.out.println(pi);
        System.out.println("S2= " + pi * (radius1*radius1) );

    }

}