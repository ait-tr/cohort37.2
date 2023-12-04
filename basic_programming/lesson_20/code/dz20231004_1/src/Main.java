/*
Придумайте и опишите класс, для любой предметной области.
Например,товар в интернет-магазине или автомобиль для продажи или любой другой.
В вашем классе должно быть несколько полей. Сделайте конструктор. Сделайте toString.
В main создайте несколько объектов своего класса, положите их в массив и,
по образу и подобию классной работы выведите на экран.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", "X7", 370, 3.5);
        Auto auto2 = new Auto("Audi", "Q7", 360, 3.2);
        Auto auto3 = new Auto("Mercedes", "Gelendewagen", 450, 6.0);
        Auto auto4 = new Auto("Porsche", "Cayenne", 380, 3.5);
        Auto auto5 = getNewAutoFromScanner();

        Auto[] allAutos = {auto1,auto2,auto3,auto4,auto5};
        for( int i=0; i<allAutos.length; i++){
            Auto salon = allAutos[i];
            System.out.println(salon.toString());
        }

//        AutoSalon auto5= new AutoSalon();
//        auto1.marke = "Opel";
//        auto1.model = ""

        Client client1 = new Client("Will", "Smith", 25, auto4);
        Client client2 = new Client("Samuel", "Jackson", 54, auto3);
        Client client3 = new Client("John", "Jameson", 45, auto2);
        Client client4 = new Client("Bill", "Klinton", 55, auto3);
        Client client5 = new Client("Leonardo", "Dikaprio", 55, auto3);
        Client client6 = new Client("Vin", "Diesel", 55, auto3);

        Client [] allClients = {client1,client2,client3,client4,client5,client6};
        for (int i=0; i < allClients.length;i++){
            Client client = allClients[i];
            System.out.println(client.toString());
        }

    }

    public static Auto getNewAutoFromScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Марку автомобиля: ");
        String marke = scanner.nextLine();

        System.out.println("Введите модель автомобиля");
        String modelle = scanner.nextLine();

        System.out.println("Введите мощность в лошадиных силах");
        int horsePower = scanner.nextInt();

        System.out.println("Введите объем двигателя двигателя");
        double engineCapacity = scanner.nextDouble();

        return new Auto(marke,modelle,horsePower,engineCapacity);

    }


}
