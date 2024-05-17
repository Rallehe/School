package ovningett;

public class Triangle extends Shape{

    private int height;
    private int width;

    public Triangle(int height, int width) {
        super("Triangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return name + " height = " + height + ", width = " + width;
    }
}
