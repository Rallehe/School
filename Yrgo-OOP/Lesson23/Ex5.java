import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex5 {
    public static void main(String[] args) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("ex5.txt"),StandardCharsets.UTF_8)) {
            writer.write("\u2661\u2665\u2661");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
