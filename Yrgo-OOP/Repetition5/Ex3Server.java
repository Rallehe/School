import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex3Server {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                System.out.println("Shutting down...");
                executorService.shutdown();
                executorService.awaitTermination(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));

        try (ServerSocket sSocket = new ServerSocket(12345)) {
            
            while (!Thread.currentThread().isInterrupted()) {
                Socket connectionToClient = sSocket.accept();
                executorService.execute(new Ex3TimeSender(connectionToClient));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
