import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ExFive {
    public static void main(String[] args) {
        System.out.println("Write some memorable");

        Path outFile = Path.of("Memorable.txt");
        
        try (BufferedWriter writer = Files.newBufferedWriter(outFile,StandardOpenOption.APPEND)) {
            Scanner input = new Scanner(System.in);
        
            String quote = input.nextLine();
            writer.write(quote + "\n");

        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid input");
        } catch (IOException ex) {
            System.out.println("We ran in to a IOException!");
        }
    }
}
