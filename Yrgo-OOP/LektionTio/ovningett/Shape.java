package ovningett;

public class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Shape = " +  name ;
    }
}
