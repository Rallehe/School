import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Warmup {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(
                new Car("Volvo", "MYP977"),
                new Car("Volvo", "ABC123"),
                new Car("Lada", "DEF321")));
        Collections.sort(cars);
        cars.forEach(System.out::println);
    }
}