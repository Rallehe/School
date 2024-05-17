import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(12345);
            Socket connectionToClient = server.accept();
            InputStream is = connectionToClient.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            OutputStream os = connectionToClient.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));

            var answer = reader.read();
            var random = ThreadLocalRandom.current().nextInt(100) + 1;
            writer.write(random);
            writer.flush();
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}