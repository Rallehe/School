import java.util.Random;
import java.util.Scanner;

public class OvningSju {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        int myScore = 0;
        int compScore = 0;
        while (menu) {
            int computerChoice = random.nextInt(3);
            System.out.println("Vilket är ditt drag? (sten/sax/pase/avsluta");
            String choice = scanner.next();
            switch (choice.toLowerCase()) {
                case ("sten"):
                    if (computerChoice == 0) {
                        System.out.println("Datorn valde sten, det är oavgjort");
                    } else if (computerChoice == 1) {
                        System.out.println("Datorn valde sax, du vann!");
                        myScore++;
                    } else if (computerChoice == 2) {
                        System.out.println("Datorn valde pase, du förlorade!");
                        compScore++;
                    }
                    break;

                case ("sax"):
                    if (computerChoice == 0) {
                        System.out.println("Datorn valde sten, du förlorade!");
                        compScore++;
                    } else if (computerChoice == 1) {
                        System.out.println("Datorn valde sax, det är oavgjort");
                    } else if (computerChoice == 2) {
                        System.out.println("Datorn valde pase, du vann!");
                        myScore++;
                    }
                    break;

                case ("pase"):
                    if (computerChoice == 0) {
                        System.out.println("Datorn valde sten, du vann!");
                        myScore++;
                    } else if (computerChoice == 1) {
                        System.out.println("Datorn valde sax, du förlorade!");
                        compScore++;
                    } else if (computerChoice == 2) {
                        System.out.println("Datorn valde pase, det är oavgjort");
                    }
                    break;

                case ("avsluta"):
                    menu = false;
                    break;
            }
            System.out.println("Du vann " + myScore);
            System.out.println("Datorn vann " + compScore);
        }
    }
}
