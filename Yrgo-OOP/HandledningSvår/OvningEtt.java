import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mata in ett nummer: ");
        int numberOne = scanner.nextInt();
        System.out.print("\nMata in ett till nummer: ");
        int numberTwo = scanner.nextInt();

        if (numberOne < numberTwo) {
            for (int i = numberOne; i <= numberTwo; i++) {
                System.out.printf("%d ", numberOne++);
            }
        } else if (numberOne > numberTwo) {
            for (int i = numberTwo; i <= numberOne; i++) {
                System.out.printf("%d ",numberTwo++);
            }
        }
    }
}