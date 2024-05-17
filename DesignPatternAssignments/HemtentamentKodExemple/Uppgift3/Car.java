package Uppgift3;

public class Car {
    private String model;
    private int price;
    private int miles;

    public Car(String model, int price, int miles) {
        this.model = model;
        this.price = price;
        this.miles = miles;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getMiles() {
        return miles;
    }

    public int accept(CarVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
