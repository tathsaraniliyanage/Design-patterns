package decorator;

import server.MessagingService;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 12:40 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public abstract class MessagingDecorator implements MessagingService {
    MessagingService messagingService;

    public MessagingDecorator(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @Override
    public abstract void sendMessage(String message);
}
