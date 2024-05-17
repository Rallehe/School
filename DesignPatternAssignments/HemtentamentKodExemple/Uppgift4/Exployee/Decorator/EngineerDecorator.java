package Decorator;

public class EngineerDecorator extends EmployeeDecorator{
    public EngineerDecorator(Employee employee) {
        super(employee);
    }
    @Override
    public double getSalary() {
        return employee.getSalary() + 2000;
    }
    @Override
    public String getRole() {
        return employee.getRole() + " Engineer";
    }
}
