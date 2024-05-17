import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class All {
    public void all(Scanner input) {
        List<String> myList = new ArrayList<>();

        String myString = "hej pa dig";
        int i = 0;
        int j = i;
        for (; i < myString.length(); i++) {
            char checkLetter = myString.charAt(i);

            if (checkLetter == ' ') {
                myList.add(myString.substring(i, j));
            }
        }
        
    }
}
