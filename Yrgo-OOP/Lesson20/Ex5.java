import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your birthday \"YYYY-MM-DD\"");
            String birthday = input.nextLine();
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.FRANCE);
            LocalDate birthdayParse = LocalDate.parse(birthday, formatter);

            long untilBirthday = ChronoUnit.DAYS.between(birthdayParse, today);

            System.out.println("You are " + untilBirthday + " days old!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
