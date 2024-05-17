package Arv;

public class Clerk extends Employee{
    public Clerk(String name, double salary) {
        super(name, salary * 1.2);
    }
    @Override
    public String getRole() {
        return "Clerk";
    }
}
