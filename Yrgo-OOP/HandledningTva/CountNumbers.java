import java.util.Scanner;

public class CountNumbers {
    
    public void counting(Scanner input) {
        int number = input.nextInt();
        int count = 0;
        for (;number != 0; number /= 10) {
            count++;
        }
        System.out.println("Ditt tal består av " + count + " siffror");
    }
}