package Decorator;

public class Lamborghini extends CarDecorator{
    public Lamborghini(Car decoratedCar) {
        super(decoratedCar);
    }
    @Override
    public String type() {
        return "I upgraded to a bit fancier car";
    }
    @Override
    public int horsePower() {
        return super.horsePower() + 700;
    }
}
