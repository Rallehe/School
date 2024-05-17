import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        System.out.print("Skriv in ett tal som får plats i byte: ");
        while (menu){
            int number = scanner.nextInt();
            if (number > 127){
                System.out.print("För stort, försök igen! ");
            }
            else if (number < -128){
                System.out.print("För litet, försök igen! ");
            }
            else{
                byte numberByte = (byte)number;
                System.out.printf("Bra, du skrev in %d", numberByte);
                break;
            }
        }
    }
}