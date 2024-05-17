import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex3Server {
    private static boolean shutdown = false;

    public static void main(String[] args) throws IOException {
        // this is a simple example of how to handle shutting
        // down gracefully when for instance receiving a Ctrl+C
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down...");
            // set a flag that indicates that it is time to shutdown
            shutdown = true;
        }));
        Files.createDirectories(Path.of("output"));
        try (ServerSocket server = new ServerSocket(12346)) {
            // use a shutdown flag in any loops that should keep
            // on going until we need to shutdown
            while (!shutdown) {
                try (Socket connectionToClient = server.accept()) {
                    handleClient(connectionToClient);
                }
            }
        }
    }

    private static void handleClient(Socket client) throws IOException {
        try (InputStream is = client.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(client.getInputStream())) {
            String fileName = readFileName(bis);
            try (OutputStream os = Files.newOutputStream(Path.of("output",
                    fileName))) {
                bis.transferTo(os);
            }
        }
    }

    private static String readFileName(BufferedInputStream bis) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int ch;

        while (true) {
            ch = bis.read();
            if (ch == -1) {
                throw new RuntimeException("this should not happen");
            } else if (ch == '\n') {
                break;
            }
            bos.write(ch);
        }
        // include some sanity check to prevent writing over some
        // files we really need. Will not allow all actual file names...
        String fileName = bos.toString(StandardCharsets.UTF_8);
        if (!fileName.matches("^[0-9a-zA-Z_.-]+$") || fileName.startsWith(".")) {
            throw new RuntimeException("file name " + fileName + " is illegal");
        }
        return fileName;
    }
}