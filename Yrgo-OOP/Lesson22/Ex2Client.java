import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Ex2Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("http://wikipedia.se", 80);
        InputStream is = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        OutputStream os = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {
            

            writer.write("GET / HTTP/1.1\nHost: wikipedia.se\nConnection: close\n\n");


        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
