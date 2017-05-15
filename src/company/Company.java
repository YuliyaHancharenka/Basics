package company;

//+ Создать компанию (класс Company) в которой есть несколько департаментов (List<Department>).
//+ В каждом департаменте работают сотрудники (Employee). У сотрудника есть id, name, surname, salary.
//+- После создания такой иерархии написать метод для посчёта средней ЗП по отделу,
// если у какого-то сотрудника ЗП меньше или равна 0 - выбросить свое исключение и его обработать
//+ метод для подсчета можно вынести в отдельный класс CalculationUtils

// в отдельный класс CalculationUtils -- ну то есть ты передаешь в него
//+ объект класса Department,
// а он уже считает и возвращает число
// Исключение напиши сама, обработай просто совсем, типа выведи сообщение, что "Ой, алярм, рабский труд, у сотрудника ЗП 0"


import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<Department>();
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
