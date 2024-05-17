import java.util.Scanner;

public class PlayEnterGame {
    public void play() {
        EnterGame playEnterGame = new EnterGame();
        Scanner enter = new Scanner(System.in);

        boolean playing = true;
        while (playing){
            playEnterGame.setRandomSec();
            playEnterGame.setCurrentTime();
    
            System.out.println("Press enter in: " + playEnterGame.getRandomSec() + " seconds");
            enter.nextLine();
            playEnterGame.setFinishTime();
            playEnterGame.setElapsedTime();
            System.out.println("Elapsed time: " + playEnterGame.getElapsedTime());
            playEnterGame.setScore();
            System.out.println("Score: " + playEnterGame.getScore());
            playEnterGame.setTotalRounds();

            System.out.println("Do you wish to play again?(Y/N)");
            String playAgain = enter.nextLine();
            playEnterGame.setHighScore();

            if (playAgain.equalsIgnoreCase("Y")) {
            } else if (playAgain.equalsIgnoreCase("N")) {
                System.out.printf("Thanks your playing, you played %d rounds and your highscore is %d", playEnterGame.getTotalRounds(), playEnterGame.getHighScore());
                playing = false;
            }
        }
    }
}