import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExOne {
    public static void main(String[] args) {
        Person p1 = new Person("Rasmus", "Rasmusson", 1943);
        Person p2 = new Person("Oskar", "Oskarsson", 1917);
        Person p3 = new Person("Per", "Persson", 1993);

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        Collections.sort(people);
        System.out.println(people);
        
        //BirthYearComparator comp = new BirthYearComparator();
        //Collections.sort(people, comp);
        //System.out.println(people);

        Comparator<Person> compBirth = Comparator.comparing(Person::getAge, Comparator.naturalOrder());
        Collections.sort(people, compBirth);

        System.out.println(people);
        System.out.println(people.equals(compBirth));
        System.out.println(people.hashCode());

        Person oneNewPerson = new Person(p1);

        System.out.println(oneNewPerson);
        
        
    }
}
