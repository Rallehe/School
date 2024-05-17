package repetitionsvar.ovningett;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class OvningEtt {
    public static String randomName() {
        List<String> firstNames = List.of("Nisse", "Bosse", "Lena", "Leyla");
        List<String> lastNames = List.of("Eriksson", "Smith", "Patel", "Rojas", "Lamm");
    
        int randomFirstName = ThreadLocalRandom.current().nextInt(4);
        int randomLastName = ThreadLocalRandom.current().nextInt(5);

        return firstNames.get(randomFirstName) + " " + lastNames.get(randomLastName);
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(randomName());
        }
    }
}