import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ShitheadClient {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);
                Socket cSocket = new Socket("localhost", 42069);
                InputStream is = cSocket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                OutputStream os = cSocket.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {
            while (true) {
                var answer = input.nextLine();
                if (answer.equals("e")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
