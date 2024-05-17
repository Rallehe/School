import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("What's your birthday? (yyyy-dd-mm)");
            var birthday = input.nextLine();
            LocalDate checkYear = LocalDate.parse(birthday);
            if (checkYear.isLeapYear()) {
                System.out.println("You are born on a leap year!");
            }
            else {
                System.out.println("You are born on a normal year");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
