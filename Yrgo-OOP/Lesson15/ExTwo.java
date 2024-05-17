import java.util.Scanner;

public class ExTwo {
    public static CheckChar getType (char a) {
        final String vowels = "aouåeiyäö";
        Character.toLowerCase(a);

        if(vowels.indexOf(a) >= 0) {
            System.out.println("It's a vowel");
            return CheckChar.VOWELS;
        }
        else if(Character.isLetter(a)) {
            System.out.println("It's a constant");
            return CheckChar.CONSONANTS;
        }
        System.out.println("It's something else");
        return CheckChar.OTHER;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write one char");
        
        
        System.out.println();
    }
}

