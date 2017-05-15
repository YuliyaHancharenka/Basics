package company;


import company.exception.CalculationException;

public class CalculationUtils {

    public static double getAvgSalary(Department department) throws CalculationException {
        int sum = 0;
        for (Employee employee : department.getEmployees()) {
            if (employee.getSalary() <= 0){
                throw new CalculationException("Bad employee salary, id = " + employee.getId());
            }
            sum = sum + employee.getSalary();
        }
        return sum / department.getEmployees().size();
    }

}
