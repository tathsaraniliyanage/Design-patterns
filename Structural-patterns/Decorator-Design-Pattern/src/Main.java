import decorator.SenderNameDecorator;
import server.MessagingService;
import server.SmsMessagingService;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 12:38 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        MessagingService smsMessagingService = new SmsMessagingService();

        smsMessagingService.sendMessage("Hello! You have a new message");
        System.out.println();
        MessagingService senderNameWithMessagingService = new SenderNameDecorator(
                new SmsMessagingService(),
                "Shamodha"
        );
        senderNameWithMessagingService.sendMessage("Hello! i'm add sender name");
    }
}
