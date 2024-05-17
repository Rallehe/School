package Decorator;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Hans", 30000);
        System.out.println(e.getSalary() + e.getRole());
        e = new EngineerDecorator(e);
        System.out.println(e.getSalary() + e.getRole());
        e = new ProgrammerDecorator(e);
        System.out.println(e.getSalary() + e.getRole());
        e = new ManagerDecorator(e, "Development");
        System.out.println(e.getSalary() + e.getRole());
    }
}
