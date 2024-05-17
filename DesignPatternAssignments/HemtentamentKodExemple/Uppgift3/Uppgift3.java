package Uppgift3;

import java.util.ArrayList;
import java.util.List;

public class Uppgift3 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>(List.of (new Car("BMW", 300000, 200),
                                        new Car("Lexus", 100000, 1200),
                                        new Car ("Honda", 19000, 15000)));
        calcPriceCar(cars);
    }

    private static void calcPriceCar(List<Car> items) {
        CarVisitor visitor = new CarVisitorImpl();
        for (var item : items) {
            System.out.println(item);
            System.out.println("After calculation: " + item.accept(visitor));
        }
    }
}
