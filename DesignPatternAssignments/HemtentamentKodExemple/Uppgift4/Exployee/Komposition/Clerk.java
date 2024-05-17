package Komposition;

public class Clerk implements Role{
    @Override
    public String getRoleName() {
        return "Role";
    }

    @Override
    public double addSalary() {
        return 1000;
    }
    @Override
    public String toString() {
        return "Clerk";
    }
}
