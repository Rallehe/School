import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Write a number");
            int number = input.nextInt();

            if (number > 10) {
                throw new IllegalArgumentException("Too big!");
            } else if (number < 0) {
                throw new RuntimeException("Too small!");
            } else {
                System.out.printf("Your number * 2 is: %d", number * 2);
            }
        }
        catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        catch(RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}