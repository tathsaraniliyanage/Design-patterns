/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 11:57 AM
 * Project: Design Patterns
 * --------------------------------------------
 **/

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car audi = carFactory.createCar(CarType.AUDI);
        Car mustang = carFactory.createCar(CarType.MUSTANG);
        Car gtr = carFactory.createCar(CarType.GTR);
        Car lambo = carFactory.createCar(CarType.LAMBO);

        System.out.println(audi.getDetails());
        System.out.println(mustang.getDetails());
        System.out.println(gtr.getDetails());
        System.out.println(lambo.getDetails());
    }
}
