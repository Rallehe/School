import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try (InputStream is = clientSocket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                OutputStream os = clientSocket.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));) {

            var milliSecond = reader.read();
            var second = milliSecond * 1000;
            Thread.sleep(second);
            writer.write("pong");
            writer.flush();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
