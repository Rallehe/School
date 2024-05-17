package Komposition;

public class Manager implements Role{
    private String department;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public String getRoleName() {
        return "Manager";
    }

    @Override
    public double addSalary() {
        return 10000;
    }

    @Override
    public String toString() {
        return "Manager at department " + department;
    }
}
