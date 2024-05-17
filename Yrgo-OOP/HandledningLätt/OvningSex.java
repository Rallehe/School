import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            System.out.println("Skriv in ett tal");
            number = scanner.nextInt();
            int numberTwo = number * 2;
            System.out.printf("Dubbelt: %d%n%n", numberTwo);
        } while (number != 0);

    }
}
