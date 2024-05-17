package Komposition;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Hans", 30000);
        e.addRole(new Clerk());
        e.addRole(new Engineer());
        System.out.println(e);
        Employee manager = new Employee("Max", 30000);
        manager.addRole(new Manager("Engineering"));
        System.out.println(manager);
    }
}
