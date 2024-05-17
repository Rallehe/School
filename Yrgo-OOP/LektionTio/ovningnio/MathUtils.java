package ovningnio;

import java.util.ArrayList;
import java.util.List;

public final class MathUtils {

    public static int smallInt(List<Integer> number) {
        int smallInt = Integer.MAX_VALUE;

        for (int integer : number) {
            if (integer < smallInt && integer >= 0) {
                smallInt = integer;
            }
        }
        return smallInt;
    }

    public static int sum(List<Integer> numbers) {

        int sum = 0;
        for (int number : numbers) {
            do {
                int digit = number % 10;
                number = number / 10;
                sum += digit;
            } while (number > 0);

        }
        return sum;
    }
}
