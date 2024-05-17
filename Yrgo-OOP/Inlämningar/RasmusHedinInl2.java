import java.util.Scanner;

public class RasmusHedinInl2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv in ett positiv heltal: ");

        int odd = 0;
        int even = 0;

        while (true) {
            int number = input.nextInt();

            if (number < 1) {
                System.out.print("Jag sa ett positivt heltal...\nFörsök igen: ");
            } 
            else {
                for (int i = 0; i <= number; i++) {
                    if (i % 2 == 0) {
                        even += i;
                    } else {
                        odd += i;
                    }
                }
                break;
            }
        }
        System.out.printf("Summan av udda tal = %d%nSumman av jämna tal = %d", odd, even);
    }
}