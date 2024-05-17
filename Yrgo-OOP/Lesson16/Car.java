import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String model;
    private String regno;

    public Car(String model, String regno) {
        this.model = model;
        this.regno = regno;
    }

    public String getModel() {
        return model;
    }

    public String getRegno() {
        return regno;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", regno=" + regno + "]";
    }

    @Override
    public int compareTo(Car o) {
        Comparator<Car> comp = Comparator.comparing(Car::getRegno)
                .thenComparing(Car::getModel);
        return comp.compare(this, o);
    }
}