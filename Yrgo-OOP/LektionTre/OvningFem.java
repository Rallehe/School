import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int letterLength = 0;
        int letterWidth = 0;
        int letterThinkness = 0;
        int letterSize = 0;

        while (letterSize == 0) {
            while (letterLength == 0) {
                System.out.println("What's the length of your letter? (mm)");
                letterLength = input.nextInt();
                if (letterLength > 600) {
                    System.out.println("Your letter is too long. (<600mm)");
                    letterLength = 0;
                } else if (letterLength < 140) {
                    System.out.println("Your letter isn't long enough. (>140mm)");
                    letterLength = 0;
                }
            }
            while (letterThinkness == 0) {
                System.out.println("What's the thickness of your letter? (mm)");
                letterThinkness = input.nextInt();
                if (letterThinkness > 100) {
                    System.out.println("Your letter is too thick. (>100mm)");
                    letterThinkness = 0;
                }
            }
            while (letterWidth == 0) {
                System.out.println("What's the width of you letter? (mm)");
                letterWidth = input.nextInt();
                if (letterWidth < 90) {
                    System.out.println("Your letter isn't wide enough. (>90mm)");
                    letterWidth = 0;
                }
            }
            letterSize = letterLength + letterThinkness + letterWidth;
            if (letterSize > 900) {
                System.out.println("Your letter is too big... " + letterSize + " (max 900mm)");
                letterLength = 0;
                letterThinkness = 0;
                letterWidth = 0;
                letterSize = 0;
            }
        }
        System.out.println("Your letter is perfect! " + letterSize + "mm");
    }
}
