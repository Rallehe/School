package Komposition;

public class Programmer implements Role{
    @Override
    public String getRoleName() {
        return "Programmer";
    }

    @Override
    public double addSalary() {
        return 4000;
    }
    @Override
    public String toString() {
        return "Programmer";
    }
}
