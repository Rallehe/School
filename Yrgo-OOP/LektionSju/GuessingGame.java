import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    private int roundTarget;
    private int guess;
    private int bestRound = Integer.MAX_VALUE;
    private int numberOfGuesses = 1;

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    public int getBestRound(){
        return bestRound;
    }

    public void setBestRound() {
        if (numberOfGuesses < bestRound) {
            this.bestRound = numberOfGuesses;
        }
    }

    public int getRoundTarget() {
        return roundTarget;
    }

    public void setRoundTarget() {
        this.roundTarget = ThreadLocalRandom.current().nextInt(10) + 1;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int answer(){
        if(guess < roundTarget) {
            return 1;
        }
        else if(guess > roundTarget) {
            return -1;
        }
        else {
            return 0;
        }
    }
    public void wrongGuess() {
        this.numberOfGuesses++;
    }
}
