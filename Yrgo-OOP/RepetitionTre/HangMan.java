import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class HangMan {
    public static void main(String[] args) {
        Path file = Path.of("paavo.txt.clean.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            Scanner scan = new Scanner(System.in); // Kanska flyttas ut?
            List<String> words = new ArrayList<>();
            List<Character> guessedLetters = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
            String randomWord = getRandomWord(words);
            System.out.println(randomWord); // test kod
            int guesses = 10;
            String previusAnswer;
            StringBuilder build = new StringBuilder();
            for (int i = 0; i < randomWord.length(); i++) {
                build.append("*");
            }
            System.out.println("Order vi söker: " + build.toString());
            while (guesses != 0) {
                previusAnswer = build.toString();
                String input = scan.nextLine();
                if (input.length() == 1) {
                    char inputChar = input.charAt(0);
                    for (int i = 0; i < randomWord.length(); i++) {
                        if (inputChar == randomWord.charAt(i)) {
                            build.setCharAt(i, inputChar);
                        }
                    }
                    if (!guessedLetters.contains(inputChar)) {
                        guessedLetters.add(inputChar);
                    } else {
                        System.out.printf("Du har redan gissa på %s din dumbom.%n", inputChar);
                    }
                } else {
                    if (input.equalsIgnoreCase(randomWord)) {
                        System.out.println("Rätt! Du vann.");
                        break;
                    } else {
                        System.out.println("Fel svar.");
                    }
                }
                System.out.println("Så här ser det ut nu: " + build.toString());
                System.out.println("Du har gissad på dessa bokstäver: " + guessedLetters);
                // TODO: Kan vi förbättra???
                if (build.toString().equalsIgnoreCase(previusAnswer)) {
                    guesses--;
                }
                System.out.println(guesses);
            }
            if (guesses == 0) {
                System.out.println("Du blev hängd.");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static String getRandomWord(List<String> list) {
        int randomNumber = ThreadLocalRandom.current().nextInt(list.size());
        return list.get(randomNumber);
    }
}
