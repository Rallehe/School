import java.util.Comparator;

public class BirthYearComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();
        return age1.compareTo(age2);
    }
}
