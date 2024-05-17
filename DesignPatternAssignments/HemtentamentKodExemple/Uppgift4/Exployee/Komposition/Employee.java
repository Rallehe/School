package Komposition;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private double salary;
    private List<Role> roles = new ArrayList<>();

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void addRole(Role role) {
        roles.add(role);
    }
    public void removeRole(Role deleteRole) {
        roles.remove(deleteRole);
    }
    public double calcSalary() {
        for (Role role : roles) {
            this.salary += role.addSalary();
        }
        return salary;
    }
    @Override
    public String toString(){
        return String.format("%s with a salary of %,.2f at roles: %s", name, calcSalary(), roles);
    }
}
