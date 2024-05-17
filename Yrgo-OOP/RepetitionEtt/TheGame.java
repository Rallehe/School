import java.util.Scanner;

public class TheGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vad heter spelar ett?");
        String playerOneName = input.nextLine();
        Player playerOne = new Player(playerOneName);

        System.out.println("Vad heter spelar två?");
        String playerTwoName = input.nextLine();
        Player playerTwo = new Player(playerTwoName);

        NumberGame game = new NumberGame(playerOne, playerTwo);
        while (true) {
            System.out.printf("%s gissa på talet. 1-10%n", game.getCurrentPlayerName());
            int guessedNumber = input.nextInt();

            if (game.guess(guessedNumber)) {
                // här har current player vunnit!
                System.out.printf("%s gissade rätt", game.getCurrentPlayerName());

                if (game.playerHasWon()) {
                    System.out.printf("%s vann!%n", game.getCurrentPlayerName());
                }
                break;
            }
            else {
                game.newRound();
                System.out.printf("Ny runda%n%n");
                System.out.printf("Poängställning:%n%s %d%n%s %d%n", 
                playerOne.getName(), playerOne.getScore(), 
                playerTwo.getName(), playerTwo.getScore());
            }
        }
    }
}
