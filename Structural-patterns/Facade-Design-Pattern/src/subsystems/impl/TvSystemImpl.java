package subsystems.impl;

import subsystems.TvSystem;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 12:14 PM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class TvSystemImpl implements TvSystem {
    @Override
    public void setChannel(int channel) {
        System.out.println("Set channel to : " + channel);
    }

    @Override
    public void turnOn() {
        System.out.println("Tv is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is OFF");
    }
}
