import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class Ex4Server {
    public static void main(String[] args) throws IOException {
        try (DatagramSocket socket = new DatagramSocket(23457)) {
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            while (true) {
                socket.receive(packet);
                String name = new String(buf, 0, packet.getLength(),
                        StandardCharsets.UTF_8);
                System.out.println("Recieved from: " + packet.getAddress());
                System.out.println(name);
                break;
            }
        }
    }
}