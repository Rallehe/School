import java.math.BigInteger;

public class OvningSjuLosning {
    public static void main(String[] args) {
        double sumDesc = 0;
        for (double i = 1e10; i >= 0; i = i - 1) {
            sumDesc += i;
        }
        System.out.println(sumDesc);
        double sumAsc = 0;
        for (double i = 0; i <= 1e10; i = i + 1) {
            sumAsc += i;
        }
        System.out.println(sumAsc);
        System.out.println("Difference desc asc: " + (sumDesc - sumAsc));
        BigInteger sum = BigInteger.ZERO;
        for (long i = 0; i <= 10_000_000_000L; i++) {
            sum = sum.add(BigInteger.valueOf(i));
        }
        System.out.println(sum);
        System.out.println("Difference desc: " + (sum.doubleValue() - sumDesc));
        System.out.println("Difference asc: " + (sum.doubleValue() - sumAsc));
    }
}