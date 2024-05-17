import java.util.List;

public class ExFive {
    public static void main(String[] args) {
        List<String> list = List.of("qwe", "rty", "asd");
        System.out.println(onlyDiff(list));
    }

    public static boolean onlyDiff(List<?> list) {
        for (Object object : list) {
            if (list.contains(object)) {
                return true;
            }
        }
        return false;
    }
}
