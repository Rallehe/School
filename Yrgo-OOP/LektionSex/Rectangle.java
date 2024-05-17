public class Rectangle {
    private double height;
    private double width;

    public Rectangle(Double height, Double width){
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
        this(3.0, 3.0);
    }

    public Rectangle(Double size){
        this.height = size;
        this.width = size;
    }
    public double getSize() {
        return height * width;
    }
    public String toString() {
        return "" + getSize();
    }
}
