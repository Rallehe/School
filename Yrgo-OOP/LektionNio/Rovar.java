import java.util.Scanner;

public class Rovar {
    public void rovar(Scanner input) {
        System.out.println("Skriv en mening");
        StringBuilder sb = new StringBuilder();
        String myString = input.nextLine();

        for (int i = 0; i < myString.length(); i++) {
            char checkLetter = myString.charAt(i);

            if (checkLetter == 'b' || checkLetter == 'c' || checkLetter == 'd' || checkLetter == 'f' || checkLetter == 'g' || checkLetter == 'h' || checkLetter == 'j' || checkLetter == 'k' || checkLetter == 'l' || checkLetter == 'm' || checkLetter == 'n' || checkLetter == 'p' || checkLetter == 'q' || checkLetter == 'r' || checkLetter == 's' || checkLetter == 't' || checkLetter == 'v' || checkLetter == 'w' || checkLetter == 'x' || checkLetter == 'z') {
                sb.append(checkLetter).append("o").append(checkLetter);
            }
            else {
                sb.append(checkLetter);
            }
        }
        System.out.println(sb.toString());
    }
}
