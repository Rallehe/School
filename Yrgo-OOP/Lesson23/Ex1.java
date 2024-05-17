import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "GB");
        try (Scanner input = new Scanner(System.in).useLocale(locale)) {
            System.out.println("Add 3 float numbers");
            NumberFormat nf = NumberFormat.getInstance(locale);
            
            var avg = calculateAverage(input);
            String printAvg =nf.format(avg);
            System.out.println(printAvg);
            System.out.printf(locale, "The average is: %f", avg);
        }
    }

    private static float calculateAverage(Scanner input) {
        var avg = 0f;
        for (int i = 0; i < 3; i++) {
            avg += input.nextFloat();
        }
        avg = avg / 3;
        return avg;
    }
}