import java.time.LocalDate;

public class Ex2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate future = ld.plusMonths(1);
        System.out.println(future);
    }
}
