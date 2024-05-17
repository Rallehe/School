package arraylatt.ovningett;

import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tenNumbers = new int[10];

        System.out.println("Add ten numbers ");

        for (int i = 0; i < tenNumbers.length; i++) {
            tenNumbers[i] = input.nextInt();
        }

        int average = 0;
        for (int i = 0; i < tenNumbers.length; i++) {
            average += tenNumbers[i];
        }
        average /= tenNumbers.length;
        System.out.printf("The average is: %d", average);
    }
}