import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            service.submit(() -> {
                for (int j = 1; j <= 50; j++) {
                    System.out.println("j" + j);
                }
            });
        }
        service.shutdown();
    }
}