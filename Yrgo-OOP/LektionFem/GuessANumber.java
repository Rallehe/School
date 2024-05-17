import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public void playGuess(Scanner input){
        Random myRandom = new Random();
        boolean menu = true;
        int randomNumber = myRandom.nextInt(11);

        while (menu){
            System.out.println("Guess a number between 0-10");
            int choice = input.nextInt();

            if (choice < randomNumber){
                System.out.println("Wrong, the answer is bigger");
            }
            else if (choice > randomNumber) {
                System.out.println("Wrong, the answer is smaller");
            }
            else if (choice == randomNumber){
                System.out.println("Correct, you won!");
                menu = false;
            }
        }
    }
}
