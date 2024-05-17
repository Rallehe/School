import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex4 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime newYear = LocalDateTime.of(today.getYear() + 1, 1, 1, 0, 0, 0);
        long untilNewYear = ChronoUnit.DAYS.between(today, newYear);
        System.out.println(untilNewYear);
    }
}
