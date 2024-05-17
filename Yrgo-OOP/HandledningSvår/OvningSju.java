import java.math.BigInteger;

public class OvningSju {
    public static void main(String[] args) {
        long start = 1;
        int timesTen = 10;
        BigInteger.valueOf(start);
        System.out.println(start);
        for (int i = 0; i < 10; i++) {
            start = start * timesTen;
            System.out.println(start);
        }
        double startTwo = 1e10;
        int dividedTen = 10;
        System.out.println(startTwo);
        for (int i = 0; i < 10; i++) {
            startTwo = startTwo / dividedTen;
            System.out.println(startTwo);
        }
    }
}
