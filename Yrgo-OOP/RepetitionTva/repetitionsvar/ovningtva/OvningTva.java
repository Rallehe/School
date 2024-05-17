package repetitionsvar.ovningtva;

import java.util.Scanner;

public class OvningTva {
    public static char mostOf(String[] textLines, char ch){
        int count[] = new int[textLines.length];
        int max = Integer.MIN_VALUE;
        char result = ' ';

        for (String string : textLines) {
            for (int i = 0; i < string.length(); i++) {
                if (max < count[string.charAt(i)]) {
                    max = count[string.charAt(i)];
                    result = string.charAt(i);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] textLines = new String[3];

        System.out.println("Add the words");

        for (int i = 0; i < 3; i++) {
            textLines[i] = input.nextLine();
        }

        System.out.println("Write one char");
        String nextChar = input.nextLine();
        char ch = nextChar.charAt(0);

        System.out.println(mostOf(textLines, ch));

    }
}
