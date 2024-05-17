package Decorator;

public class ClerkDecorator extends EmployeeDecorator{
    public ClerkDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public double getSalary() {
        return employee.getSalary() + 2000;
    }

    @Override
    public String getRole() {
        return employee.getRole() + " Clerk";
    }
}
