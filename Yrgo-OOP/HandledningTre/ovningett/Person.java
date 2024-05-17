package ovningett;

import java.util.ArrayList;
import java.util.List;

public final class Person {
    private String firstName;
    private String surName;

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }
    
    @Override
    public String toString() {
        return firstName + " " + surName;
    }
    /**
     * Method to generate all the combinations possible. It takes in two lists and makes a new list that is the perfect size for all the combinations.
     * @param firstName Takes in the full list of firstnames 
     * @param surName Takes in the full list of surnames
     * @return Return the new list with all the combinations
     */
    public static List<Person> generateAllCombinations(List<String> firstName, List<String> surName) {
        List<Person> newPerson = new ArrayList<>(firstName.size() * surName.size());

        for (String first : firstName) {
            for (String sur : surName) {
                newPerson.add(new Person(first, sur));
            }
        }
        return newPerson;
    }
}
