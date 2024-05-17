import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OvningFem {
    public static List<Integer> getFibonnaci (int length) {
        List<Integer> fibonnaci = new ArrayList<>();
        int firstNumber = 1;
        int secondNumber = 0;

        for (int i = 0; i < length; i++) {
            fibonnaci.add(firstNumber);
            secondNumber += firstNumber;
            fibonnaci.add(secondNumber);
            firstNumber += secondNumber;
        }

        return fibonnaci;
    }
    public static void main(String[] args) {
        List<Integer> fibo = getFibonnaci(5);
        Collections.reverse(fibo);
        System.out.println(fibo);
    }
}