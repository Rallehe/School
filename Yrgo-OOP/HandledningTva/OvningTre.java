import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CountNumbers startCountNumbers = new CountNumbers();

        System.out.println("Skriv in ett positivt heltal");
        startCountNumbers.counting(input);
    }
}