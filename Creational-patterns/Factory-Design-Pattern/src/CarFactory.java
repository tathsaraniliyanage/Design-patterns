/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 11:44 AM
 * Project: Design Patterns
 * --------------------------------------------
 **/
// Factory
public class CarFactory {

    public Car createCar(CarType carType) {
        return switch (carType) {
            case GTR -> new Gtr();
            case MUSTANG -> new Mustang();
            case LAMBO -> new Lambo();
            case AUDI -> new Audi();
        };
    }
}
