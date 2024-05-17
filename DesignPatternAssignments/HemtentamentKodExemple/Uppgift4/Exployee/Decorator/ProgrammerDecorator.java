package Decorator;

public class ProgrammerDecorator extends EmployeeDecorator{
    public ProgrammerDecorator(Employee employee) {
        super(employee);
    }
    @Override
    public double getSalary() {
        return employee.getSalary() + 3000;
    }
    @Override
    public String getRole() {
        return employee.getRole() + " Programmer";
    }
}
