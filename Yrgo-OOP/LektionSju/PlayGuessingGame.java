import java.util.Scanner;

public class PlayGuessingGame {
    public void play(Scanner input) {
        GuessingGame newGame = new GuessingGame();
        boolean whilePlay = true;
        
        System.out.print("Guess a number between 1-10\n");
        
        while (whilePlay) {
            newGame.setRoundTarget();
            while (newGame.answer() != 0) {

                newGame.setGuess(input.nextInt());
                newGame.answer();

                if (newGame.answer() == 1) {
                    System.out.println("Wrong, the correct answer is bigger!");
                    newGame.wrongGuess();
                } else if (newGame.answer() == -1) {
                    System.out.println("Wrong, the correct answer is smaller!");
                    newGame.wrongGuess();
                } else if (newGame.answer() == 0) {
                    newGame.setBestRound();
                    System.out.println("Correct!");
                    System.out.printf("It took you %d guesses%n", newGame.getNumberOfGuesses());
                    System.out.println("Your best round took " + newGame.getBestRound());
                    System.out.println("Do you wish to play again? (Y/N)");

                    input.nextLine();
                    String playAgain = input.nextLine();
                    if (playAgain.equalsIgnoreCase("Y")) {
                        System.out.print("Guess a number between 1-10\n");
                        newGame.setNumberOfGuesses(1);
                    }
                    else if (playAgain.equalsIgnoreCase("N")) {
                        System.out.println("Thanks for playing!");
                        whilePlay = false;
                    }
                }
            }
        }
    }
}