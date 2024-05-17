import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OvningSex {
    public static List<Double> getExchange(int currency) {
        List<Double> grandExchange = new ArrayList();
        double euro = 1, sek = 0.092, nok = 0.095, dkk = 0.13, gbp = 1.14;
        grandExchange.add(euro);
        grandExchange.add(sek);
        grandExchange.add(nok);
        grandExchange.add(dkk);
        grandExchange.add(gbp);
        Collections.sort(grandExchange);
        return grandExchange;
    }

    public static void main(String[] args) {

    }
}
