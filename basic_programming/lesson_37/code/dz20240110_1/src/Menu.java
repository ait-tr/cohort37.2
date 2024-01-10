import java.util.Scanner;

public class Menu {
    public static MailDeliveryService selectDeliveryService(){
        MailDeliveryService selectedService = null;
        System.out.println("1. DHL");
        System.out.println("2. Email");
        System.out.println("3. Pigeon");
        System.out.println("Любая другая цифра - выход");

        Scanner scanner = new Scanner(System.in);

        int select = scanner.nextInt();
        switch (select){
            case 1: selectedService = new DHL();break;
            case 2: selectedService = new Email();break;
            case 3: selectedService = new Pigeon();break;
        }

        return selectedService;
    }
}
