public class Sender {
    public static void send(MailDeliveryService deliveryService){
        if (deliveryService != null) {
            System.out.println("Начинаю отправку: ");
            deliveryService.sendMail();
            System.out.println("Сообщение отправлено");
            System.out.println();
        }
    }
}
