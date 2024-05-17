import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExService implements Runnable{
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        service.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("i " + i);
                if (i >= 5) {
                    service.submit(() -> {
                        for (int j = 0; j < 10; j++) {
                            System.out.println("j "+ j);
                        }
                    });
                }
            }
        });
        service.shutdown();
    }

    @Override
    public void run() {

    }
}
