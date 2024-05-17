import java.util.List;
import java.util.stream.Collectors;

public class ExTwo {
    public static void main(String[] args) {
        var names = List.of("Lena ", " Karl", "  ", "Boo ", "   Berit", " ", "Bo", "G", "Fe", "Mark");
        var myList = names.stream()
        .filter(g -> g.charAt(1) != 'a')
        .map(String::trim)
        .filter(s -> s.length() > 2)
        .map(String::toLowerCase)
        .collect(Collectors.toList());

        for (String string : myList) {
            System.out.println(string);
        }
    }
}
