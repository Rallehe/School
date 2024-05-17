import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task1
        List<Person> persons = List.of(
                new Person("Bob", "bob@email.com"),
                new Person("Ben", "ben@email.com"),
                new Person("Pam", "pam@email.com"),
                new Person("Eve", "eve@email.com"),
                new Person("Guy", "guy@email.com"),
                new Person("Lis", "lis@email.com"),
                new Person("Ann", "ann@email.com"));

        System.out.println(persons);
        Storage.save(persons);

        persons = Storage.fetchPersons(persons);
        System.out.println(persons);

        //Task 2
        Role engineer = new Role("Engineer");
        Role manager = new Role("Manager");
        List<Role> initialRole = new ArrayList<>();
        initialRole.add(engineer);

        Employee e = new Employee("Testsson", "Engineering", initialRole);
        System.out.println(e);

        e.addRole(manager);
        System.out.println(e);

        e.removeRole(engineer);
        System.out.println(e);
    }
}
