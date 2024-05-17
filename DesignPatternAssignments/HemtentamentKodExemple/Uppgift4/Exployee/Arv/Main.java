package Arv;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
        new Employee("Hans", 30000),
        new Manager("Karl", 30000, "development"),
        new Engineer("Oskar", 30000),
        new Programmer("karl", 30000),
        new Clerk("Bert", 30000));

        for (Employee e : employeeList) {
            System.out.println(e.getName() + " with a salary of: " + e.getSalary() + " with current role: " + e.getRole());
        }
    }
}
