public class OvningTre {
    public static void main(String[] args) {
        float radius = 12.3f;
        // code goes here, use StrictMath.PI
        float circumference = (float) (radius * 2 * StrictMath.PI);
        float area = (float) (radius * radius * StrictMath.PI);
        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);
    }
}
