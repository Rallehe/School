package interfacelatt.ovningtva;

import java.util.Scanner;

public class OvningTva {
    public static int minimum(int[] values){
        int smallestNumber = 0;

        for (int i = 0; i < values.length; i++) {
            if (smallestNumber == 0) {
                smallestNumber = values[i];
            }
            else if (values[i] < smallestNumber) {
                smallestNumber = values[i];
            }
        }
        return smallestNumber;
    }

    public static int maximum(int[] values) {
        int largestNumber = 0;
        for (int i = 0; i < values.length; i++) {
            if (largestNumber == 0) {
                largestNumber = values[i];
            }
            else if (values[i] > largestNumber) {
                largestNumber = values[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[4];

        System.out.println("Add a number");
        values[0] = input.nextInt();
        System.out.println("Add a number");
        values[1] = input.nextInt();
        System.out.println("Add a number");
        values[2] = input.nextInt();
        System.out.println("Add a number");
        values[3] = input.nextInt();

        System.out.println("Do you wish to see the smallest or largest number?");
        input.nextLine();
        String choise = input.nextLine();

        if (choise.equalsIgnoreCase("smallest")) {
            System.out.println("min: " + minimum(values));
        }
        else if (choise.equalsIgnoreCase("largest")) {
            System.out.println("max: " + maximum(values));
        }
    }
}
