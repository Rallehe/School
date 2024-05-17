import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {
        System.out.println("Vad är din favorit siffra?");
        Scanner scanner = new Scanner(System.in);
        int favNumber = scanner.nextInt();
        if (favNumber <= 0 || favNumber >= 10){
            System.out.println("Det är ingen siffra utan ett nummer!");
        }
        else {
            System.out.println("Det är en bra siffra!");
        }
    }
}
