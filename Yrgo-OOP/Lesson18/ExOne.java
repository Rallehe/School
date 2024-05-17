import java.util.ArrayList;
import java.util.Collections;

public class ExOne {
    public static void main(String[] args) {
        var pair = new Pair<Integer>(123, 132);
        System.out.println(pair.getVal1() + pair.getVal2());

        var list = new ArrayList<Pair<Integer>>();
        list.add(new Pair<>(1, 0));
        list.add(new Pair<>(0, 1));
        list.add(new Pair<>(1, 1));

        Collections.sort(list);
        System.out.println(list);
    }
}