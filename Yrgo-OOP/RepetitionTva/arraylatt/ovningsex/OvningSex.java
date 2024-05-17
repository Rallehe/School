package arraylatt.ovningsex;

import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add three people");
        String[] person = new String[3];

        for (int i = 0; i < person.length; i++) {
            person[i] = input.nextLine();
        }
        System.out.println("How much money did you win?");
        int money = input.nextInt();

        System.out.printf("%s gets %d %s gets %d and %s gets %d",person[0], money/2, person[1], money/4, person[2], money /4);
    }
}
