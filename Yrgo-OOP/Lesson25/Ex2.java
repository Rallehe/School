import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            createJob(i, service);
        }
        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
    }

    private static void createJob(int i, ExecutorService service) {
        service.submit(() -> {
            for (int j = 1; j <= 50; j++) {
                System.out.println("j" + i);
            }
        });
    }
}