import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket är ditt favorit djur?");
        String djur = scanner.nextLine();

        if (djur.equalsIgnoreCase("hund")){
            System.out.println("Voof!");
        }
    }
}
