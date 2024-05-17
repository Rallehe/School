import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ExEight {
    public static void main(String[] args) {
        

        try (Scanner input = new Scanner(System.in)) {
            Path tempFile = Files.createTempFile(null, null);
            writeWords(input, tempFile);
        }
        catch (IOException ex) {
            System.out.println("An error occurred");
        }
    }

    public static void writeWords(Scanner input, Path tempFile) throws IOException{
        String words;
        try (BufferedWriter write = Files.newBufferedWriter(tempFile)) {
            do {
                System.out.println("Write something to add to a file (Enter to exit)");
                words = input.nextLine();
                write.write(words);
            } while (!words.equals(""));
            
            Path result = Path.of("result.txt");
            if(Files.exists(result)) {
                Files.delete(result);
            }
            Files.move(tempFile, result);
        }
    }
}
