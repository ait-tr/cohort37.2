/*
Допустим, у вас есть прибор, у которого есть 3 колбы.
Каждая колба имеет датчик температуры (в программе, соответственно 3 переменных int с температурой).
Считается, что прибор работает правильно, если температура в каждой из трех колб не меньше 100 или есть такая колба, температура которой более 200 градусов.
Напишите программу проверки корректности работы такого прибора.

 */

public class Main {
    public static void main(String[] args) {
        int temperature1 = 130;
        int temperature2 = 150;
        int temperature3 = 101;
        // ----------------------------------------------------

        boolean condition1 = temperature1 >= 100 && temperature2 >= 100 && temperature3 >= 100;
        boolean condition2 = temperature1 > 200 || temperature2 > 200 || temperature3 > 200;

        boolean isDeviceOk = condition1 || condition2;

        //boolean isDeviceOk = (temperature1>=100 && temperature2>=100 && temperature3>=100) ||(temperature1>200 || temperature2>200 || temperature3>200);


        // ---------------------------------------------------------------
        System.out.println("flask1="+temperature1);
        System.out.println("flask2="+temperature2);
        System.out.println("flask3="+temperature3);
        if (isDeviceOk) {
            System.out.println(">>>   device is ok!!!");
        } else {
            System.out.println(">>>   alarm!!!");
        }
    }
}