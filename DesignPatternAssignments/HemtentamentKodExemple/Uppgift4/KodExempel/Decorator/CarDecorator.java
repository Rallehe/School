package Decorator;

public class CarDecorator implements Car{
    private Car decoratedCar;
    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }
    @Override
    public String type() {
        return decoratedCar.type();
    }
    @Override
    public int horsePower() {
        return decoratedCar.horsePower();
    }
}
