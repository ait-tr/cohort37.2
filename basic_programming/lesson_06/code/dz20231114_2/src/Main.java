/*
Допустим, у вас есть прибор, у которого есть 2 колбы. Каждая колба имеет датчик температуры (в программе температура задается переменными).
Считается, что прибор работает правильно,
если температура в одной из колб (*в любой из* может в первой, а может во второй !) меньше 100, а в другой более 200 градусов.
Напишите программу проверки корректности работы такого прибора.

 */


public class Main {
    public static void main(String[] args) {
        int temperatureFlask1 = 10;
        int temperatureFlask2 = 400;

        /// ---------------------------------------------------------------------------
        boolean isDeviceCorrect =   (temperatureFlask1<100 && temperatureFlask2>200)   ||   // ИЛИ
                                    (temperatureFlask2<100 && temperatureFlask1>200 );
        //-------------------------------------------------------------------------------

        System.out.println( "temperatureFlask1:" + temperatureFlask1 + "   temperatureFlask2:" + temperatureFlask2);
        if(isDeviceCorrect){
            System.out.println("ok!");
        } else {
            System.out.println("Alarm!!!!!");
        }

    }
}