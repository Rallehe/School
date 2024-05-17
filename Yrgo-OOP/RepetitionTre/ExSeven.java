import java.nio.file.Files;
import java.nio.file.Path;

public class ExSeven {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("No file name given!");
            System.exit(-1);
        }
        Path inFile = Path.of(args[0]);
        if(isReadableRegularFile(inFile)) {
            System.out.println("A regular readable file!");
        }
        else {
            System.out.println("It's not a regular readable file!");
        }
    }

    public static boolean isReadableRegularFile(Path p) {
        return Files.isReadable(p) && Files.isRegularFile(p);
    }
}
