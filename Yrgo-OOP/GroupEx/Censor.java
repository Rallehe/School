import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Censor {
    private Path swearTxt;
    private int count;
    private Map<String, String> goodAndBadWords = new HashMap<>();

    public int getCount() {
        return count;

    }

    public Censor(Path swearTxt) throws IOException {
        this.swearTxt = swearTxt;
        censorship(swearTxt, goodAndBadWords);
    }

    private void censorship(Path swearTxt, Map<String, String> goodAndBadWords) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(swearTxt)) {
            String badWord;
            String goodWord;
            while ((badWord = reader.readLine()) != null) {
                if ((goodWord = reader.readLine()) != null) {
                    goodAndBadWords.put(badWord, goodWord);
                }
            }
        }
    }

    public Map<String, String> getMap() {
        return goodAndBadWords;
    }

    public static List<String> readFile(Path inFile) throws IOException {
        List<String> uncensoredText = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(inFile)) {
            String textLine;
            while ((textLine = reader.readLine()) != null) {
                String[] allWords = textLine.split("((?<=\\W+)|(?=\\W+))");
                for (String string : allWords) {
                    uncensoredText.add(string);
                }
            }
            return uncensoredText;
        }
    }

    public List<String> convertText(List<String> uncensoredList) {
        List<String> censoredList = new ArrayList<>();
        for (String line : uncensoredList) {
            for (String badWord : goodAndBadWords.keySet()) {
                if (line.equalsIgnoreCase(badWord)) {
                    line = goodAndBadWords.get(badWord);
                    count++;
                }
            }
            censoredList.add(line);
        }
        return censoredList;
    }
}
