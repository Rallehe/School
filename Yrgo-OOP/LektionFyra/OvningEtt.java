import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {
        System.out.println("Skriv in startvärde för fakulteten");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}