public class OvningFyra {
    public static void main(String[] args) {
        double radius = 1e20;
        // code goes here, use StrictMath.PI
        double circumference = radius * 2 * StrictMath.PI;
        double area = radius * radius * StrictMath.PI;
        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);

        float radius1 = 1e20f;
        // code goes here, use StrictMath.PI
        float circumference1 = (float) (radius1 * 2 * StrictMath.PI);
        float area1 = (float) (radius1 * radius1 * StrictMath.PI);
        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference1);
        System.out.printf("Arean på cirkeln är %.2f.\n", area1);
    }
}
