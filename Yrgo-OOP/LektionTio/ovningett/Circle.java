package ovningett;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public String toString() {
        return name + " radius = " + radius;
    }
}