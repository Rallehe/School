import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ExSeven {
    public static void main(String[] args) throws IOException {
        File file = new File("JPGTEST.jpg");
        File file2 = new File("HelloWorldNew.txt");
        String fileType = Files.probeContentType(file.toPath());
        String fileType2 = Files.probeContentType(file2.toPath());
        System.out.println(fileType);
        System.out.println(fileType2);
    }
}
