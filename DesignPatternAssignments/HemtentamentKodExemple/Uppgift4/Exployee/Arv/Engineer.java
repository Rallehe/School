package Arv;

public class Engineer extends Employee{
    public Engineer(String name, double salary) {
        super(name, salary * 1.1);
    }
    @Override
    public String getRole() {
        return "Engineer";
    }
}
