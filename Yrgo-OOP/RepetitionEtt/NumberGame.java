
import java.util.concurrent.ThreadLocalRandom;

public class NumberGame {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int roundTarget;

    public NumberGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        this.currentPlayer = playerOne;
        if (ThreadLocalRandom.current().nextBoolean()){
            this.currentPlayer = playerTwo;
        }
        this.roundTarget = ThreadLocalRandom.current().nextInt(10) + 1;
    }

    public void newRound() {
        roundTarget = ThreadLocalRandom.current().nextInt(10) + 1; // Genererar ett random tal mellan 1-10
    }

    public boolean guess(int guessedNumber) {
        if (guessedNumber == roundTarget) {
            currentPlayer.guessedRight();
            return true;
        } else {
            currentPlayer.guessedWrong();
            swapPlayer();
            return false;
        }
    }

    public String getCurrentPlayerName(){
        return currentPlayer.getName();
    }

    public boolean playerHasWon() {
        return currentPlayer.getScore() >= 10;
    }

    private void swapPlayer() {
        if (currentPlayer == playerOne) {
            currentPlayer = playerTwo;
        }
        else {
            currentPlayer = playerOne;
        }
    }
}
