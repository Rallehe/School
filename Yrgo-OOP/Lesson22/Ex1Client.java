import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {

            var random = ThreadLocalRandom.current().nextInt(100) + 1;
            writer.write(random);
            writer.flush();

            var answer = reader.read();

            System.out.println(answer);

            if (answer < random) {
                System.out.println("Victory!");
            }
            else if (answer > random) {
                System.out.println("Defeat");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
