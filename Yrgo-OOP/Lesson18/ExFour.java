import java.util.List;

public class ExFour {
    public static void main(String[] args) {
        List<String> myList = List.of("apa", "bepa", "cepa");
        System.out.println(oddNumber(myList));
        List<Integer> myList1 = List.of(2, 4, 6, 5);
        System.out.println(oddNumber(myList1));
        List<Double> myList3 = List.of(12.1, 32.5, 12.5, 32.1, 9.3);
        System.out.println(oddNumber(myList3));
    }

    public static boolean oddNumber (List<?> list) {
        if(list.size() % 2 == 0) {
            return false;
        }
        return true;
    }
}
