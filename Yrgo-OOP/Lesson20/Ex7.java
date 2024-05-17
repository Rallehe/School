import java.time.LocalDateTime;

public class Ex7 {
    public static void main(String[] args) {
        try {
            while(true) {
                var ldt = LocalDateTime.now();
                long ldtLong = ldt.getMinute();
                Thread.sleep(1000);
                if (ldtLong % 5 == 0) {
                    System.out.println(ldt);
                    break;
            }

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
