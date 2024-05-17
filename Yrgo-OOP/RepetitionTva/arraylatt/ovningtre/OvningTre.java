package arraylatt.ovningtre;

import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a word");
        String word = input.nextLine();

        int numberOfChar = 0;
        for (int i = 0; i < word.length(); i++) {
            numberOfChar++;
        }
        System.out.printf("Your word contains %d chars", numberOfChar);
    }
}
