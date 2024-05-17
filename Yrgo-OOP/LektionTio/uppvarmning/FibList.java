package uppvarmning;
import java.util.AbstractList;

public class FibList extends AbstractList<Integer> {
    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        // calculate fib(index)
        if (index == 0) {
            return 0;
        }
        int a = 0;
        int b = 1;
        int c;
        for (int i = 2; i <= index; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    @Override
    public int size() {
        // fib(47) will overflow int
        return 46;
    }
}