package arraylatt.ovningtva;

import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the capital of Japan? ");
        String answer = input.nextLine();

        if(answer.equalsIgnoreCase("Tokyo")) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong!");
        }
    }
}
