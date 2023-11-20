/* C Методами
Допустим, у вас есть прибор, у которого есть 3 колбы.
Каждая колба имеет датчик температуры (в программе, соответственно 3 переменных int с температурой).
Считается, что прибор работает правильно, если температура в каждой из трех колб не меньше 100 или есть такая колба, температура которой более 200 градусов.
Напишите программу проверки корректности работы такого прибора.

 */
public class Main2 {
    public static void main(String[] args) {
        int temperature1 = 130;
        int temperature2 = 150;
        int temperature3 = 101;

        boolean isDeviceOk = checkDevice(temperature1,temperature2,temperature3);
        printDeviceStatus(temperature1,temperature2,temperature3,isDeviceOk);
    }

    public static void printDeviceStatus(int temperature1, int temperature2, int temperature3, boolean isDeviceOk){
        System.out.println("flask1="+temperature1);
        System.out.println("flask2="+temperature2);
        System.out.println("flask3="+temperature3);
        if (isDeviceOk) {
            System.out.println(">>>   device is ok!!!");
        } else {
            System.out.println(">>>   alarm!!!");
        }
    }


    /*
        если температура в каждой из трех колб не меньше 100
     */
    public static boolean checkCondition1(int temperature1, int temperature2, int temperature3){
        return temperature1 >= 100 && temperature2 >= 100 && temperature3 >= 100;
    }

    /*
    температура которой более 200 градусов
     */
    public  static boolean checkCondition2(int temperature1, int temperature2, int temperature3){
        return temperature1 > 200 || temperature2 > 200 || temperature3 > 200;
    }


    public  static boolean checkDevice(int temperature1, int temperature2, int temperature3) {
        return  checkCondition1(temperature1,temperature2,temperature3) ||
                checkCondition2(temperature1,temperature2,temperature3);
    }
}
