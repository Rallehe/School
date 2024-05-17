import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Write a number: ");
        int numberOne = input.nextInt();

        System.out.print("Write another number: ");
        int numberTwo = input.nextInt();

        int i;

        if (numberOne > numberTwo){
            int temp = numberTwo;
            numberTwo = numberOne;
            numberOne = temp;
        }
        if (numberOne % 2 != 0) {
            numberOne--;
        }
        if (numberTwo % 2 != 0) {
            numberTwo++;
        }
        for (i = numberOne + 2; i < numberTwo; i = i + 2) {
            if (numberOne % 2 == 0 || numberTwo % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
