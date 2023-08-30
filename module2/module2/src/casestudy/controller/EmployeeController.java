package casestudy.controller;

import casestudy.model.Person.Employee;
import casestudy.service.IEmployeeService;
import casestudy.service.impl.EmployeeService;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeService();
    public void printEmployee(){this.employeeService.printEmployee();}
    public void addEmployee(Employee employee){this.employeeService.addEmployee(employee);}
    public void editEmployee(Employee employee){this.employeeService.editEmployee(employee);}
    public void deleteEmployee(String name){this.employeeService.deleteEmployee(name);}
    public void findEmployee(String name){this.findEmployee(name);}

    public void printEmployee(String name1) {
    }
}
