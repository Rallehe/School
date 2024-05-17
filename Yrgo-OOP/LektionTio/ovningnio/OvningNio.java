package ovningnio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningNio {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Add five numbers");

        for (int i = 0; i < 5; i++) {
            int addNumber = input.nextInt();
            number.add(addNumber);
        }
        System.out.println(MathUtils.smallInt(number));

        System.out.println(MathUtils.sum(number));
        
        
    }
}
