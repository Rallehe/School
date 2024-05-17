import java.util.Scanner;

public class OvningEtt{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = input.nextLine();

        System.out.println("What's your age?");
        int age = input.nextInt();

        System.out.println("How tall are you (in m)?");
        double height = input.nextDouble();

        if (age < 13){
            System.out.println("I'm not allowed to collect your information.");
        }
        else {
            System.out.printf("%s %d %.0fcm", name, age, (height*100));
            if (height > 1.74){
                System.out.println("\nYou're taller than the average Swede");
            }
        }

    }
}