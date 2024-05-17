import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Path swearTxt = Path.of("Swears.txt");
        Path testTxt = Path.of(args[0]);
        
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("testtext.txt"))){

            Censor debug = new Censor(swearTxt);

            List<String> navyseal = debug.readFile(testTxt);
            List<String> censoredNavySeal = debug.convertText(navyseal);

            for (String string : censoredNavySeal) {
                if (string.endsWith(".")) {
                    writer.write(string);
                    writer.newLine();
                } else {
                    writer.write(string);
                }
                
            }
            System.out.println("\n" + debug.getCount());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}