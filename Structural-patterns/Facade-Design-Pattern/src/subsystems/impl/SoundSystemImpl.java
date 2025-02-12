package subsystems.impl;

import subsystems.SoundSystem;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 12:10 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class SoundSystemImpl implements SoundSystem {
    @Override
    public void setVolume(int volume) {
        System.out.println("Set volume to : " + volume);
    }

    @Override
    public void turnOn() {
        System.out.println("Sound is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Sound is OFF");
    }
}
