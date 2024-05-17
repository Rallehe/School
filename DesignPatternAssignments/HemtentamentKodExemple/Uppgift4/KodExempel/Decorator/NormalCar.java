package Decorator;

public class NormalCar implements Car{
    @Override
    public String type() {
        return "Normal boring car";
    }
    @Override
    public int horsePower() {
        return 105;
    }
}
