package subsystems;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 12:08 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public interface DVDPlayer extends PowerSystem {
    void playMovie(String movieName);
    void stopMovie();
}
