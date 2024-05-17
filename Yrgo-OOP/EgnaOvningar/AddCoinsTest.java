import java.util.Scanner;

public class AddCoinsTest {
    public void runPiggyBank() {

        PiggyBankTest newPiggyBank = new PiggyBankTest();
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        
        while (menu) {
            System.out.println("What do you wish to do?" +
            "\n1)Add coins\n2)Check vaule\n3)Check amount of coins\n4)Exit");
            String choise = input.nextLine();
            
            if (choise.equals("1")) {
                addCoins(input, newPiggyBank);
            } else if (choise.equals("2")) {
                System.out.printf("Your piggybank value is %d%n", newPiggyBank.getValue());
            } else if (choise.equals("3")) {
                System.out.printf("Your piggybanks contains %d coins%n", newPiggyBank.getNumberOfCoins());
            } else if (choise.equals("4")) {
                menu = false;
            } else {
                System.out.println("Invalid choise, try again");
            }
        }
    }

    public void addCoins(Scanner input, PiggyBankTest newPiggyBank) {
        String addCoin = "";
        while (!addCoin.equals("0")) {
            System.out.println("What coin do you wish to add? (1/2/5/10 or 0 to exit)");
            addCoin = input.nextLine();
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
            } else if (!addCoin.equals("0")){
                System.out.println("Invalid coin, try again");
            }
        }
    }
}