import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to the guessing game. ");

        PlayGuessingGame playNewGame = new PlayGuessingGame();
        playNewGame.play(input);
    }
}