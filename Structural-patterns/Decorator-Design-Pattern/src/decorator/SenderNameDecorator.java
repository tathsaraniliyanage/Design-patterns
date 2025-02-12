package decorator;

import server.MessagingService;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 12:44 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class SenderNameDecorator extends MessagingDecorator {
    private String senderName;

    public SenderNameDecorator(MessagingService messagingService, String senderName) {
        super(messagingService);
        this.senderName = senderName;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(senderName + " : ");
        messagingService.sendMessage(message);
        System.out.println("after");
    }
}
