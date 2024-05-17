import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mata in så många heltal du vill (0 för att addera talen):");

        List<Integer> numbers = new ArrayList<>();
        int addNumber = 1;

        while (addNumber != 0) {
            addNumber = input.nextInt();
            numbers.add(addNumber);
        }
        System.out.println("Summan är " + sum(numbers));
    }

    private static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}