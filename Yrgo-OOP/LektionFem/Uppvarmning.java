public class Uppvarmning {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setHeight(10);
        box1.setWidth(20);
        box1.setDepth(30);
        System.out.printf("Box volume is %d.%n", box1.getVolume());
    }
}