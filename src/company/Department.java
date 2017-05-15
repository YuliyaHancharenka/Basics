package company;


import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void fireEmployee(Employee employee){
        employees.remove(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        System.out.println("Call get employee");
        return employees;
    }

}
