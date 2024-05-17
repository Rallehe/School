import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv en mening");
        String word = scanner.nextLine();

        System.out.println("Skriv en bokstav som finns i meningen");
        char letter = scanner.next().charAt(0);
        
        int letterCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char firstLetterWord = word.charAt(i);
            if (letter == firstLetterWord){
                letterCount++;
            }
        }
        System.out.printf("Din mening innehåller %d stycken %s", letterCount, letter);
    }
}
