public class Ex5 {
    private static boolean isPrime(long num) {
        for (long i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
