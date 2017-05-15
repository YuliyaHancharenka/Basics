package company;


import company.exception.CalculationException;

public class Runner {

    public static void main(String[] args) {
        Company pilyulayaCompany = new Company("Ololol");

        Department sushiDepartment = new Department("Sushi Department");

        Employee e1 = new Employee(1,"Vasya","Pupkin", 700);
        Employee e2 = new Employee(3,"Alex","Shmaleks", 900);
        Employee e3 = new Employee(14,"Kate","Baleba", 0);

        sushiDepartment.addEmployee(e1);
        sushiDepartment.addEmployee(e2);
        sushiDepartment.addEmployee(e3);

        pilyulayaCompany.addDepartment(sushiDepartment);

        System.out.println(pilyulayaCompany.getDepartments().size());

        for (Department department: pilyulayaCompany.getDepartments()){
            System.out.println(department.getEmployees().size());
        }

        double avgSalary = 0;
        try {
            avgSalary = CalculationUtils.getAvgSalary(sushiDepartment);
            System.out.println(avgSalary);
        } catch (CalculationException e) {
            System.out.println(e.getMessage());
        }


    }
}
