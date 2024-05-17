import java.util.Scanner;

public class Uppvarmning {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; --i) {
            System.out.printf("T minus %d seconds to lift off...%n", i);
        }
        System.out.println("... and we have lift off!");
    }
}