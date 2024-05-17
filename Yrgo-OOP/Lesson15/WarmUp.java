import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class WarmUp {
    /**
     * Generate n number of unique random numbers.
     * 
     * @param n the number of random numbers
     * @return a set of the random numbers
     */
    public static Set<Integer> uniqueRandom(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < n) {
            numbers.add(ThreadLocalRandom.current().nextInt());
        }
        return numbers;
    }

    public static void main(String[] args) {
        Set<Integer> numbers = uniqueRandom(10);
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}