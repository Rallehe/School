import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex3TimeSender implements Runnable {
    private Socket connetionToClient;
    private BufferedWriter writer;

    public Ex3TimeSender(Socket connetionToClient) {
        this.connetionToClient = connetionToClient;
    }

    @SuppressWarnings("java:S2189")
    @Override
    public void run() {
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        while (!Thread.currentThread().isInterrupted()) {
            var now = LocalDateTime.now();
            try {
                writer = new BufferedWriter(new OutputStreamWriter(connetionToClient.getOutputStream()));
                writer.write(now.format(formatTime));
                writer.write("\n");
                writer.flush();
                Thread.sleep(1000);

            } catch (InterruptedException | IOException e) {
                try {
                    connetionToClient.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
