import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex4Client {

    public static void main(String[] args) throws IOException {
        try (DatagramSocket socket = new DatagramSocket();
                BufferedReader br = Files.newBufferedReader(Path.of("names.txt"))) {
            br.lines().forEach(line -> {
                try {
                    byte[] buf = line.getBytes(StandardCharsets.UTF_8);
                    InetAddress recipient = InetAddress.getByName("localhost");
                    DatagramPacket packet = new DatagramPacket(buf, buf.length,
                            recipient, 23457);
                    socket.send(packet);
                } catch (IOException ex) {
                    System.out.println("fel: " + ex.getMessage());
                }
            });
        }
    }
}
