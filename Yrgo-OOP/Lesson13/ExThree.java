import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExThree {
    public static void main(String[] args) throws IOException {
        Path rPath = Path.of("HelloWorld.txt");
        try (BufferedReader r = new BufferedReader(new FileReader("HelloWorld.txt"))) {
            String line;
            while ((line = r.readLine()) != null)
            if (Files.isReadable(rPath)) {
                    System.out.print(line);
            } else {
                System.out.println("The file doesn't exist");
            }
        }
    }
}