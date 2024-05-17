package Decorator;

public class ManagerDecorator extends EmployeeDecorator{
    private String department;
    public ManagerDecorator(Employee employee, String department) {
        super(employee);
        this.department = department;
    }
    @Override
    public double getSalary() {
        return employee.getSalary() + 5000;
    }
    @Override
    public String getRole() {
        return employee.getRole() + " Manager at " + this.department;
    }
}
