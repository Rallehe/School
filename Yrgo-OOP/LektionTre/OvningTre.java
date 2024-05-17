import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your age? (xxxx)");
        int age = scanner.nextInt();
        if (age <= 2004){
            System.out.println("You're allowed to buy beer!");
        }
        else {
            System.out.println("You're not allowed to buy beer ;(");
        }
    }
}
