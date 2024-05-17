import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex3Client {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Must give a file name");
            System.exit(-1);
        }
        Path file = Path.of(args[0]);
        // just get the last path of the path, the actual file name
        String fileName = file.getName(file.getNameCount() - 1).toString();
        try (Socket socket = new Socket("localhost", 12346)) {
            socket.getOutputStream().write(fileName.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().write('\n');
            try (InputStream bis = Files.newInputStream(file)) {
                bis.transferTo(socket.getOutputStream());
            }
        }
    }
}