import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex6Server {
    @SuppressWarnings("java:S2189")
    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(12345);
            server.setReuseAddress(true);

            while (true) {
                Socket connectionToClient = server.accept();
                System.out.println("New client connected" + connectionToClient.getInetAddress().getHostAddress());

                ClientHandler clientSocket = new ClientHandler(connectionToClient);
                new Thread(clientSocket).start();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}