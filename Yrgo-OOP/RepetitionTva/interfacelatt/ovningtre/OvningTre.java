package interfacelatt.ovningtre;

import java.util.Scanner;

public class OvningTre {
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
            Operator minimum = new Minimum();
            System.out.println(minimum.getName() + minimum.operation(values) + " average: " + minimum.average(values) + " total: " + minimum.total(values));
        } else if (choise.equalsIgnoreCase("largest")) {
            Operator maximum = new Maximum();
            System.out.println(maximum.getName() + maximum.operation(values) + " average: " + maximum.average(values) + " total: " + maximum.total(values));
        }
    }
}