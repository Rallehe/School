import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        try (BufferedReader inFile = Files.newBufferedReader(Path.of(args[0]));
                BufferedWriter outFile = Files.newBufferedWriter((Path.of(args[1])))) {
            Set<String> uniqueWords = new HashSet<>();
            String line;
            var totalWords = 0;
            while ((line = inFile.readLine()) != null) {
                String splString[] = line.split(" ");
                var newLine = splString;
                for (String string : newLine) {
                    totalWords++;
                    uniqueWords.add(string);
                }
            }
            var count = 0;
            for (int i = 0; i < uniqueWords.size(); i++) {
                count++;
            }
            File absolutePath = new File(args[0]);
            outFile.write("FileName: " + absolutePath.getAbsolutePath());
            
            var formatTime = LocalDateTime.now();
            outFile.write("\nDate: " + formatTime);
            
            outFile.write("\nWords processed: " + totalWords);
            
            outFile.write("\nTotal unique words: " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
