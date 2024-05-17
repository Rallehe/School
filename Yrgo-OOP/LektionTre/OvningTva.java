import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add your height to your rectangle: ");
        double height = scanner.nextDouble();
        System.out.print("Add your width to your rectangle: ");
        double width = scanner.nextDouble();
        double area = width*height;
        double circumference = (width * 2)  + (height * 2);
        System.out.printf("The area of the rectangle is %.2f%n", area);
        System.out.printf("The circumference of the rectangle is %.2f%n", circumference);
        if (area >= 1000){
            System.out.println("The rectangle is huge!!!");
        }
    }
}
