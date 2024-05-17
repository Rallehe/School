import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Map.Entry;

public class TheCore {

    public static Map<Character, Integer> countOccurence(Path inFile, Map<Character, Integer> numberOfOccurence) throws IOException{

        try (BufferedReader reader = Files.newBufferedReader(inFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if(Character.isWhitespace(line.charAt(i))) {
                        continue;
                    }
                    numberOfOccurence.merge(line.charAt(i), 1, (prev, one) -> prev + one);
                }
            }
        }
        return numberOfOccurence;
    }

    // This prints out the final result in a nice and tidy way
    @SuppressWarnings("java:S106")
    public static void printResult(Map<Character, Integer> numberOfOccurence) {
        for (Entry<Character, Integer> name : numberOfOccurence.entrySet()) {
            Character key = name.getKey();
            Integer vaule = name.getValue();
            System.out.println(key + ": " + vaule);
        }
    }
}
