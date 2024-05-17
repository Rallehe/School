import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public void play(Scanner input) {
        Random myRandom = new Random();
        boolean menu = true;
        int myScore = 0;
        int compScore = 0;

        while (menu) {
            int computerChoice = myRandom.nextInt(3);
            System.out.println("What's your choise (rock/paper/scissor/exit)");

            String choice = input.nextLine();
            switch (choice.toLowerCase()) {

                case ("rock"):
                    if (computerChoice == 0) {
                        System.out.println("Computer picked rock, no one won");
                    } else if (computerChoice == 1) {
                        System.out.println("Computer picked scissor, you won!");
                        myScore++;
                    } else if (computerChoice == 2) {
                        System.out.println("Computer picked paper, you lost!");
                        compScore++;
                    }
                    break;

                case ("scissor"):
                    if (computerChoice == 0) {
                        System.out.println("Computer picked rock, you lost!");
                        compScore++;
                    } else if (computerChoice == 1) {
                        System.out.println("Computer picked scissor, no one won");
                    } else if (computerChoice == 2) {
                        System.out.println("Computer picked paper, you won!");
                        myScore++;
                    }
                    break;

                case ("paper"):
                    if (computerChoice == 0) {
                        System.out.println("Computer picked rock, you won!");
                        myScore++;
                    } else if (computerChoice == 1) {
                        System.out.println("Computer picked scissor, you lost!");
                        compScore++;
                    } else if (computerChoice == 2) {
                        System.out.println("Computer picked paper, no one won");
                    }
                    break;

                case ("exit"):
                    menu = false;
                    break;
            }
            System.out.println("You won " + myScore);
            System.out.println("The computer " + compScore);
        }
    }
}
