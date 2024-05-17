package Decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new NormalCar();
        System.out.println(car.type() + " with " + car.horsePower() + " horsepower");
        car = new Lamborghini(car);
        System.out.println(car.type() + " with " + car.horsePower() + " horsepower");
    }
}
