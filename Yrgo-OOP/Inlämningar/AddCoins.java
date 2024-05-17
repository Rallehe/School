import java.util.Scanner;

public class AddCoins {
    public void addCoins(Scanner input, PiggyBank newPiggyBank) { // This method adds coins to the piggybank
        String addCoin = ""; // Initializing addCoin with nothing

        while (!addCoin.equals("0")) {
            System.out.println("What coin do you wish to add? (1/2/5/10 or 0 to exit)");
            addCoin = input.nextLine(); // String instead of int to keep it from crashing
            if (addCoin.equals("1")) {
                newPiggyBank.setNumberOfCoins(1);
                newPiggyBank.setValue(1);
            } else if (addCoin.equals("2")) {
                newPiggyBank.setNumberOfCoins(1);
                newPiggyBank.setValue(2);
            } else if (addCoin.equals("5")) {
                newPiggyBank.setNumberOfCoins(1);
                newPiggyBank.setValue(5);
            } else if (addCoin.equals("10")) {
                newPiggyBank.setNumberOfCoins(1);
                newPiggyBank.setValue(10);
            } else if (!addCoin.equals("0")) { // A check to see if it's not 0 so it doesn't print "Invalid" when exiting
                System.out.println("Invalid coin, try again");
            }
        }
    }
}
