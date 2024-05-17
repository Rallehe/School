package litetspel;

import java.util.Scanner;

import litetspel.Player.Interactive;

public class OvningEtt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player newPlayer = new Player("Hampus");
        Interactive rock = new Rock();
        Interactive horse = new Horse();
        Interactive mirror = new Mirror();

        boolean menu = true;
        while (menu) {
            System.out.println("You see a rock a horse and a mirror, what do you wish to interact with? (0 to exit)");
            String choise = input.nextLine();

            if (choise.equals("rock")) {
                rock.interact(newPlayer);
            } else if (choise.equals("horse")) {
                horse.interact(newPlayer);
            } else if (choise.equals("mirror")) {
                mirror.interact(newPlayer);
            } else if (choise.equals("0")) {
                menu = false;
            }
        }
    }
}
