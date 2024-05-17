import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WarmUp {
    public static void main(String[] args) throws IOException {
        for (String filename : args) {
            Path path = Path.of(filename);
            if (!Files.isReadable(path)) {
                continue;
            }
            try (BufferedReader reader = Files.newBufferedReader(path)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
    }
}