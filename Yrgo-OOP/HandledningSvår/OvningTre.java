import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mata in ett tal: ");
        int number = scanner.nextInt(); //Read number
        int res = 0;
        int numberStart = number;
        if (number >= 1){
            for (int i = number; i >= 1; i--) {
                String stringInt = String.valueOf(number);
                char firstChar = stringInt.charAt(0); //Checks first char of stringInt
                if (firstChar == '1'){
                    res++;
                }
                number--;
            }
            System.out.printf("Mellan 1 och %d finns det %d tal som börjar på en etta.", numberStart, res);
        }
        else if (number <= -1){
            for (int i = number; i <= -1; i++) {
                String stringInt = String.valueOf(number);
                char firstChar = stringInt.charAt(1);
                if (firstChar == '1'){
                    res++;
                }
                number++;
            }
            System.out.printf("Mellan -1 och %d finns det %d tal som börjar på en etta.", numberStart, res);
        }
        else{
            System.out.println("Ogiltigt tal!");
        }
    }
}