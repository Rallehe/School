import java.util.Scanner;

public class Uppvarmning {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Skriv in ett heltal, t.ex. 0:");
            int d = scanner.nextInt();

            System.out.println("Talet blev: " + (100 / d));
            System.out.println("Ett fint tal tycker jag.");
            
        } catch (ArithmeticException ex) {
            System.out.println("Det uppstod ett fel: " +
                    ex.getLocalizedMessage());
        } finally {
            System.out.println("...avslutar!");
        }
    }
}