import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = scanner.nextDouble();
        int bounce = 0;
        while (height > 0.01){
            height = height * 0.7;
            bounce++;
        }
        System.out.println(bounce);
    }
}
