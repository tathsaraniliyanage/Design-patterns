/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 11:35 AM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        GlobalHandler globalHandler1 = Singleton.getInstance().getGlobalHandler();
        GlobalHandler globalHandler2 = Singleton.getInstance().getGlobalHandler();
        GlobalHandler globalHandler3 = Singleton.getInstance().getGlobalHandler();

        System.out.println(globalHandler1.equals(globalHandler2));
        System.out.println(globalHandler2.equals(globalHandler3));
        System.out.println(globalHandler1.equals(globalHandler3));

        System.out.println(globalHandler1.hashCode());
        System.out.println(globalHandler2.hashCode());
        System.out.println(globalHandler3.hashCode());
    }
}
