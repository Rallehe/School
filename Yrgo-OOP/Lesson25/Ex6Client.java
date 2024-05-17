import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex6Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
        InputStream is = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        OutputStream os = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
        Scanner input = new Scanner(System.in)) {

            var second = input.nextInt();
            writer.write(second);
            writer.flush();
            var response = reader.readLine();
            System.out.println(response);

        }
        catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
