package Decorator;

public abstract class EmployeeDecorator extends Employee{
    protected Employee employee;
    public EmployeeDecorator(Employee employee) {
        super(employee.getName(), employee.getSalary());
        this.employee = employee;
    }
    @Override
    public abstract double getSalary();
    @Override
    public abstract String getRole();
}
