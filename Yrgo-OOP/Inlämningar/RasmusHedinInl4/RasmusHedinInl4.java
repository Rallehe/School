import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class RasmusHedinInl4 {
    @SuppressWarnings("java:S106")
    public static void main(String[] args) { 
        Map<Character, Integer> numberOfOccurence = new TreeMap<>();

        for (int i = 0; i < args.length; i++) {
            try {
                Path inFile = Path.of(args[i]);
                TheCore.countOccurence(inFile, numberOfOccurence);
            } catch (NoSuchFileException ex) {
                    System.err.println("File " + args[i] + " does not exist.");
            } catch (IOException ex) {
                System.err.println("Couldn't read the file. Make sure its \"java RasmusHedinInl4 filename.txt\"");
            }
        }
        TheCore.printResult(numberOfOccurence);
    }
}
