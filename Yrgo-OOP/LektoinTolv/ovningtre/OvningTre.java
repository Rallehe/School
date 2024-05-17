package ovningtre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number!");
        int number = input.nextInt();
        try {
            imBadYouKnowIt(number);
            System.out.println(number);
        }
        catch (InputMismatchException ex) {
            System.out.println("Invalid input, it has to be a positive integer" + ex.getMessage());
        }
        catch (IndexOutOfBoundsException ex1) {
            System.out.println("Array size to small! " + ex1.getMessage());
        }
        catch (ArithmeticException ex2) {
            System.out.println("Error, looks like you can't count " + ex2.getMessage());
        }
        catch (NullPointerException ex3) {
            System.out.println("Error, the random generator landed on " + ex3.getMessage());
        }
    }

    public static int imBadYouKnowIt(int value) {
        Integer[] arr = { Integer.valueOf(0), null, Integer.valueOf(2) };
        int i = (int)(Math.random() * 5);
        return value / arr[i];
        }
}
