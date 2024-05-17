import java.util.Scanner;

public class OvningNio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("");

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name);
        }
    }
}