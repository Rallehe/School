import java.util.Random;
import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomInt = random.nextInt(11);
        System.out.println("Guess a random number between 1-10");
        int guess;
        do {
            guess = scanner.nextInt();

            if(guess < randomInt){
                System.out.println("Wrong, the correct answer is bigger");
            }
            else if (guess > randomInt){
                System.out.println("Wrong, the correct answer is smaller");
            }
            else{
                System.out.println("You guessed correct!");
            }
        } while (guess != randomInt);
    }
}
