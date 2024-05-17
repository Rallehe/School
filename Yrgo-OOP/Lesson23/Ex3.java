import java.text.DateFormatSymbols;
import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        try {
            Locale localeSE = Locale.forLanguageTag("sv-SE");
            Locale localseSW = Locale.forLanguageTag("gsw-CH");

            DateFormatSymbols dfsSE = new DateFormatSymbols(localeSE);
            DateFormatSymbols dfsSW = new DateFormatSymbols(localseSW);

            for (String month : dfsSE.getMonths()) {
                System.out.println(month);
            }
            for (String month : dfsSW.getMonths()) {
                System.out.println(month);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
