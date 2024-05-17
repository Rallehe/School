import java.util.Scanner;

public class Uppvarmning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad heter du? ");
        String name = scanner.nextLine();
        System.out.printf("Hejsan, %s.%n", name);
    }
}