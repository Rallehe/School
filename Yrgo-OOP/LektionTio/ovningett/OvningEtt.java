package ovningett;

import java.util.ArrayList;
import java.util.List;

public class OvningEtt {
    public static void main(String[] args) {
        Shape c1 = new Circle (12);
        Shape c2 = new Circle(42);
        Shape t1 = new Triangle(32, 12);
        Shape t2 = new Triangle(20, 10);

        List<Shape> shapes = new ArrayList<>();
        
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(t1);
        shapes.add(t2);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
