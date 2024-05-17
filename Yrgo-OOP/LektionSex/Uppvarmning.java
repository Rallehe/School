public class Uppvarmning {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(10, 10, 10);
        System.out.printf("Box 1 volume is %d.%n", box1.getVolume());
        System.out.printf("Box 2 volume is %d.%n", box2.getVolume());
    }
}