public class Main {
    public static void main(String[] args) {
        MailDeliveryService deliveryService = null;
        do {
            deliveryService = Menu.selectDeliveryService();
            Sender.send(deliveryService);

        } while ( deliveryService!=null);
    }
}