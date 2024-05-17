import java.util.Scanner;

public class ScannerMetod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ScannerMetodClass test = new ScannerMetodClass();
        test.someScanner(input);

        System.out.println(test.toString());
    }
}
