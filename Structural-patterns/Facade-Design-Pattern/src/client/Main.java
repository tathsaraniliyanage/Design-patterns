package client;

import facade.HomeTheater;
import facade.HomeTheaterFacade;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 12:26 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        HomeTheater homeTheater = new HomeTheaterFacade();
        System.out.println("Preparing to watch movie...");

        homeTheater.watchMovie("Hello");

        System.out.println();
        System.out.println("Stopping..........");
        homeTheater.stopMovie();
    }
}
