package arraylatt.ovningnio;

import java.util.Scanner;

public class OvningNio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write 10 names");
        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            names[i] = input.nextLine();
        }
        String shortName = "lllllllllllllllllll";
        for (String name : names) {
            if (name.length() < shortName.length()) {
                shortName = name;
            }
        }
        String longName = "";
        for (String name : names) {
            if (name.length() > longName.length()) {
                longName = name;
            }
        }
        System.out.printf("The longest name is: %s%nThe shorest name is: %s", longName, shortName);
    }
}
