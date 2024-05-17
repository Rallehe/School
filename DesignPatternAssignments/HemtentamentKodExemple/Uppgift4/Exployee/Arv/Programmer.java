package Arv;

public class Programmer extends Engineer {
    public Programmer(String name, double salary) {
        super(name, salary * 1.2);
    }
    @Override
    public String getRole() {
        return "Programmer";
    }
}
