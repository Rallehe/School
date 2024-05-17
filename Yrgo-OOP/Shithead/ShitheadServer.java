import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ShitheadServer {
    private static boolean shutdown = false;

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down...");
            shutdown = false;
        }));

        try (ServerSocket server = new ServerSocket(42069)) {
            Socket connectionToClient = server.accept();
            System.out.println("New connection: " + server.getInetAddress());
            while (!shutdown) {
                try (Scanner input = new Scanner(System.in);
                        InputStream is = connectionToClient.getInputStream();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                        OutputStream os = connectionToClient.getOutputStream();
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {
                            var answer = input.nextLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
