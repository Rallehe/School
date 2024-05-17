package ovningtva;

import java.util.ArrayList;
import java.util.List;

public class OvningTva {
    public static List<String> everyOther(List<String> list) {
        List<String> newList = new ArrayList<>();
        boolean checkLast = true;

        for (String string : list) {
            if (checkLast) {
                newList.add(string);
                checkLast = false;
            }
            else {
                checkLast = true;
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<String> myList = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K");
        System.out.println(OvningTva.everyOther(myList));
    }
}
