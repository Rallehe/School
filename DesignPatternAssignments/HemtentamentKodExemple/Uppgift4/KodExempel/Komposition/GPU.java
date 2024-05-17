package Komposition;

public class GPU {
    private String brand;
    private String type;
    public GPU(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
    @Override
    public String toString() {
        return brand + " " + type;
    }
}
