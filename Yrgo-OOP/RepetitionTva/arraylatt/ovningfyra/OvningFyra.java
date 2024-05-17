package arraylatt.ovningfyra;

import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a word");
        String word = input.nextLine();
        
        char[] wordInChar = word.toCharArray();
        
        for (int i = wordInChar.length - 1; i >= 0; i--) {
            System.out.print(wordInChar[i]);
        }
        
    }
}
