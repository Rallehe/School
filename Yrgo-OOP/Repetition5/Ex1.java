import java.time.LocalDate;

public class Ex1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate inThirtyDays = today.plusDays(30);
        LocalDate inOneMonth = today.plusMonths(1);
        System.out.println(today);
        System.out.println(inThirtyDays);
        System.out.println(inOneMonth);
    }
}