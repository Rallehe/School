import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your birthdate? (yyyy-mm-dd)");
        String dob = input.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dob);
        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(dateOfBirth, today);

        System.out.printf("You're born: %s%nYou are: %d years old", dateOfBirth, years);
    }
}
