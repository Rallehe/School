import java.util.Scanner;

public class PiggyBankMenu { // This class is the class we call to start the program
    public void runPiggyBank() { // This method keeps most of the in/out data, including the menu
        AddCoins newAddCoins = new AddCoins(); // Start a new instance of AddCoins
        PiggyBank newPiggyBank = new PiggyBank(); // Start a new instance of PiggyBank
        Scanner input = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("What do you wish to do?" +
                    "\n1)Add coins\n2)Check vaule\n3)Check amount of coins\n4)Exit");
            String choise = input.nextLine(); // String instead of int scanner to keep the program from crashing

            if (choise.equals("1")) {
                newAddCoins.addCoins(input, newPiggyBank); // Call for the method addCoins and send add a scannar and the PiggyBank instance
            } else if (choise.equals("2")) {
                System.out.printf("Your piggybank value is %d%n", newPiggyBank.getValue()); // Get the total value of the piggybank
            } else if (choise.equals("3")) {
                System.out.printf("Your piggybanks contains %d coins%n", newPiggyBank.getNumberOfCoins()); // Get the total number of coins added
            } else if (choise.equals("4")) {
                menu = false;
            } else {
                System.out.println("Invalid choise, try again");
            }
        }
    }
}