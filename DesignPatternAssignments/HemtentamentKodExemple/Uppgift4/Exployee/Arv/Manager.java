package Arv;

public class Manager extends Employee {
    private String deparment;
    public Manager(String name, double salary, String deparment) {
        super(name, salary * 1.3);
        this.deparment = deparment;
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}
