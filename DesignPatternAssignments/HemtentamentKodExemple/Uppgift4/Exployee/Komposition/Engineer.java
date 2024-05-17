package Komposition;

public class Engineer implements Role {
    @Override
    public String getRoleName() {
        return "Engineer";
    }
    @Override
    public double addSalary() {
        return 3000;
    }
    @Override
    public String toString() {
        return "Engineer";
    }
}
