package arraylatt.ovningsju;

import java.util.Scanner;

public class OvningSju {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a word: ");
        String word = input.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i));
            System.out.println(sb);
        }
    }
}