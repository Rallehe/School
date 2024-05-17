import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ex3Client {
    public static void main(String[] args) {
        try (Socket cSocket = new Socket("localhost", 12345);
        BufferedReader reader = new BufferedReader(new InputStreamReader(cSocket.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
