package server;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 12:36 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class SmsMessagingService implements MessagingService{
    @Override
    public void sendMessage(String message) {
        System.out.println(message+ " [SMS]");
    }
}
