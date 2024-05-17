import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExSix {
    public static void main(String[] args) throws IOException{
        Path pathOne = Path.of(args[0]);
        Path pathTwo = Path.of(args[1]);
        try (InputStream buffRead = Files.newInputStream(pathOne)){
            OutputStream buffWrite = Files.newOutputStream(pathTwo);
            
            buffRead.transferTo(buffWrite);
            buffWrite.flush();
        }
    }
}
