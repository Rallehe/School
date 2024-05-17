package Uppgift3;

public class CarVisitorImpl implements CarVisitor {
    @Override
    public int visit(Car car) {
        if (car.getMiles() > 1000) {
            return car.getPrice() - 2000;
        }
        return car.getPrice();
    }
}
