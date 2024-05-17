import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex3 {
    public static void main(String[] args) {
        // use set to make sure we read one file only once
        Set<Path> files = new TreeSet<>();
        for (int i = 0; i < args.length; ++i) {
            files.add(Path.of(args[i]).toAbsolutePath().normalize());
        }
        ExecutorService service = Executors.newCachedThreadPool();
        // we could skip the executor and use paralellStream() instead
        files.stream().forEach((file) -> {
            service.submit(() -> {
                String fileName = file.getName(file.getNameCount() - 1).toString();
                int count = countCharacter(file, 'A');
                System.out.printf("%s: %d st A.%n", fileName, count);
            });
        });
        service.shutdown();
    }

    private static int countCharacter(Path file, char ch) {
        int count = 0;
        try (BufferedReader br = Files.newBufferedReader(file)) {
            int res;
            while ((res = br.read()) != -1) {
                if ((char) res == ch) {
                    count++;
                }
            }
        } catch (IOException ex) {
            System.err.println("Ett I/O-fel inträffade: " + ex.getMessage());
            return -1;
        }
        return count;
    }
}
