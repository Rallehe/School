import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many prime numbers do you wish to see");
        int totalNumbers = input.nextInt();

        PrimTal newPrimtal = new PrimTal();
        for (int i = 0; i <= totalNumbers; i++) {
            System.out.println(newPrimtal.toString());
            newPrimtal.increaseNumber();
        }
    }
}