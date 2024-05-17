package ovningett;

import java.util.List;

public class OvningEtt {
    public static void main(String[] args) {
        List<String> firstName = List.of("Adam", "Markus", "Hampus", "Oskar", "Klas", "Lisa", "Marine");
        List<String> surName = List.of("Andersson", "Smith", "Hejson", "Eriksson", "Bengts");
        
        System.out.println(Person.generateAllCombinations(firstName, surName));
        
    }
}
