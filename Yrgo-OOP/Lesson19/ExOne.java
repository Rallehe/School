import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var names = new ArrayList<String>();
        System.out.println("Add 5 names");
        for (int i = 0; i < 5; i++) {
            var name = input.nextLine();
            names.add(name);
        }
        for (String string : names) {
            System.out.println(string);
        }
    }
}