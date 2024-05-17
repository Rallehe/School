import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex3 {
    public static void main(String[] args) {
        LocalTime gbg = LocalTime.now();
        ZoneId nyc = ZoneId.of("GMT-5");
        ZonedDateTime zdt = ZonedDateTime.now(nyc);
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String gbgOutput = gbg.format(outputFormat);
        String zdtOutput = zdt.format(outputFormat);
        System.out.println("Nyc: " + zdtOutput);
        System.out.println("Gbg: " + gbgOutput);
    }
}
