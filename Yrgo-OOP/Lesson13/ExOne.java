import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExOne {
    public static void main(String[] args) throws IOException{
        Path file = Path.of("HelloWorld.txt"); 
        try(BufferedWriter w = Files.newBufferedWriter(file,StandardOpenOption.APPEND)) {
            w.write("HelloWorld!");
            w.newLine();
        }
    }
}
