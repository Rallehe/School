import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in ett heltal");
        int numberOne = input.nextInt();
        System.out.println("Skriv in ett till heltal");
        int numberTwo = input.nextInt();
        System.out.println("Vad vill du veta om talen? (min/max)");
        String choice = input.next();
        switch (choice.toLowerCase()) {
            case "max":
                if (numberOne > numberTwo){
                    System.out.printf("Största talet är %d", numberOne);
                }
                else if (numberOne == numberTwo){
                    System.out.println("Dom är lika stora");
                }
                else {
                    System.out.printf("Största talet är %d", numberTwo);
                }
                break;

            case "min":
                if ( numberOne < numberTwo){
                    System.out.printf("Minsta talet är %d", numberOne);
                }
                else if (numberOne == numberTwo){
                    System.out.println("Dom är lika stora");
                }
                else{
                    System.out.printf("Minsta talet är %d", numberTwo);
                }
                break;
        }

    }
}
