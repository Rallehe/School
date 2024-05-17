import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) {
        boolean menu = true;
        Scanner input = new Scanner(System.in);
        
        while (menu){
            System.out.println("Welcome!");
            System.out.println("1)Play rock, paper, scissor!");
            System.out.println("2)Guess a number!");
            System.out.println("3)Exit!");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                RockPaperScissor rockPaperScissor = new RockPaperScissor();
                rockPaperScissor.play(input);
                break;
                
                case 2:
                GuessANumber guessANumber = new GuessANumber();
                guessANumber.playGuess(input);
                break;

                case 3:
                menu = false;
                break;

                default:
                System.out.println("Invalid option!");
            }
        }
    }
}
