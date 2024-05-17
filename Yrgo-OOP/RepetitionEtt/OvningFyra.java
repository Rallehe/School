import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Skriv in ett udda tal:");
        
        int oddNumber;
        do {
            oddNumber = input.nextInt();
            if(oddNumber % 2 == 0) {
                System.out.println("Skriv ett udda tal sa jag!");
            }
        } while (oddNumber % 2 == 0);

        for (int i = 0; i < oddNumber; i++) {
            System.out.println("");

            for (int j = 0; j < oddNumber; j++) {
                if (i == j || (oddNumber-1-i) == j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }   
}
