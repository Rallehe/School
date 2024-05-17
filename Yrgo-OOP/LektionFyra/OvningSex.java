import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilken storlek på din enhetsmatris?");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("");
            for (int j = 0; j < size; j++) {
                if (i == j){
                    System.out.print("1 ");
                }
                else if(i!=j){
                    System.out.print("0 ");
                }
            }
        }
    }
}
