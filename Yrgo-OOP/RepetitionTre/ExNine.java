import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExNine {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("You need to add a file to copy and a name of the file you wish to copy to.");
        }
        //Path in = Path.of(args[0]);
        //Path out = Path.of(args[1]);
        Path in = Path.of("ABC.txt");
        Path out = Path.of("ABCNEW.txt");
        try {
            copy(in, out);
            
        } catch (IOException ex) {
            System.out.println("You ran in to an error!");
        }
    }

    public static void copy(Path from, Path to) throws IOException{
        try (InputStream inFile = Files.newInputStream(from);
        OutputStream outFile = Files.newOutputStream(to, StandardOpenOption.CREATE_NEW)) {
            if(Files.exists(to)) {
                System.out.println("The file already exists");
                System.exit(-1);
            }
            
            byte[] buffer = new byte[4096];
            while(true) {
                int size = inFile.read(buffer);
                if(size == -1) {
                    break;
                }
                outFile.write(buffer);
            }
        }
    }
}
