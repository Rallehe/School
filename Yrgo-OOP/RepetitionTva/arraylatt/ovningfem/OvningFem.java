package arraylatt.ovningfem;

import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a word");
        String word = input.nextLine();
        
        boolean isPalindrome = true;
        
        for (int i = 0; i < word.length(); i++) {
            char checkLetterFirst = word.charAt(i);
            char checkLetterLast = word.charAt(word.length() - i -1);
            if (checkLetterFirst != checkLetterLast){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.printf("Your word %s is a palindrome", word);
        } else {
            System.out.printf("Your word %s is not a palidrome", word);
        }
    }
}