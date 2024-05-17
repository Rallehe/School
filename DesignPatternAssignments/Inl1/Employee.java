import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String name;
    private String department;
    private List<Role> roles;
    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public Employee(String name, String department, List<Role> initialRole) {
        this.name = name;
        this.department = department;
        this.roles = initialRole;
    }

    public String name(){ return name; }
    public String department(){ return department; }

    public void addRole(Role newRole) {
        roles.add(newRole);
    }

    public void removeRole(Role deleteRole) {
        roles.remove(deleteRole);
    }
    @Override
    public String toString(){
        return String.format("%s at %s roles: %s", name, department, roles);
    }
}
