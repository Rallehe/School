import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to eat?\n1. Starter\n2. Main\n3. Fika");
        int choice = input.nextInt();
        switch (choice){
            case (1):
            System.out.println("Bread\nSoup\nCheese");
            break;

            case (2):
            System.out.println("Pasta\nPotato\nRice");
            break;

            case (3):
            System.out.println("Coffee\nTea\nCake");
            break;
        }
    }
}
