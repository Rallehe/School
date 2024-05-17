import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Skriv in ett klockslag: ");
            String time = input.nextLine();
            if (time.charAt(0) >= '3' || time.charAt(2) != ':' || time.charAt(3) >= '7') {
                System.out.println("Det är inte ett korrekt klockslag!");
            } 
            else if (time.charAt(0) == '2' && time.charAt(1) >= '5') {
                System.out.println("Det är inte ett korrekt klockslag!");
            } 
            else if (time.charAt(0) == '2' && time.charAt(1) >= '4'){
                System.out.println("Det är inte ett korrekt klockslag!");
            }
            else {
                System.out.println("Det är ett korrekt klockslag!");
                break;
            }
        }
    }
}