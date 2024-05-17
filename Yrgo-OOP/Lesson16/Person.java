import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{
    private String firstName;
    private String surName;
    private int birthYear;

    public Person(String firstName, String surName, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthYear = age;
    }
    
    public Person(Person other) {
        this.firstName = other.firstName;
        this.surName = other.surName;
        this.birthYear =other.birthYear;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getSurName() {
        return surName;
    }
    
    public int getAge() {
        return birthYear;
    }
    
    @Override
    public int compareTo(Person o) {
        Comparator<Person> comp = Comparator.comparing(Person::getSurName);
        return comp.compare(this, o);
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", surName=" + surName + ", age=" + birthYear + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 42;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((surName == null) ? 0 : surName.hashCode());
        result = prime * result + ((birthYear == 0) ? 0 : birthYear);
        return result;
    }

}
