package ovningtre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningTre {
    /**
     * Converts a string into a chat array
     * @param string takes the input word into the method
     * @return the char array
     */
    public static char[] fromString(String string) {
        char[] arrayString = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            arrayString[i] = string.charAt(i);
        }
        
        return arrayString;
    }
    /**
     * Converts the char array into a char list
     * @param string takes the char array into the method
     * @return the char list
     */
    public static List<Character> fromArray(char[] string) {
        List<Character> listString = new ArrayList<>();

        for (int i = 0; i < string.length; i++) {
            listString.add(string[i]);
        }
        return listString;
    }
    /**
     * Converts the char list back into a string
     * @param string takes the char list into the method
     * @return the original string
     */

    public static String fromList(List<Character> string) {
        StringBuilder sb = new StringBuilder();
        for (Character character : string) {
            sb.append(character);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write something");
        String word = input.nextLine();
        String same = fromList(fromArray(fromString(word)));
        System.out.println(same);
    }
}