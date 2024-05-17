import java.util.Scanner;

public class ScannerMetodClass {
    private int data;

    public void someScanner(Scanner input) {
        int test = input.nextInt();
        this.data = test;
    }

    public String toString() {
        return "ScannerMetodClass [data=" + data + "]";
    }
}
