import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        if (args.length == 1) {
            locale = Locale.forLanguageTag(args[0]);
        }
        ResourceBundle lang = ResourceBundle.getBundle("ex4", locale);
        try (Scanner scan = new Scanner(System.in)) {
            scan.useLocale(locale);
            double[] numbers = new double[3];
            for (int i = 0; i < numbers.length; ++i) {
                System.out.println(lang.getString("typeNumber"));
                numbers[i] = scan.nextDouble();
            }
            double sum = Arrays.stream(numbers).sum();
            double mean = sum / numbers.length;
            System.out.printf(locale, lang.getString("mean"), mean);
        }
    }
}