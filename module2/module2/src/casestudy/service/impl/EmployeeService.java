package casestudy.service.impl;

import casestudy.model.Person.Employee;
import casestudy.respository.IEmployeeRepository;
import casestudy.respository.impl.EmployeeRepository;
import casestudy.service.IEmployeeService;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void printEmployee() {
        this.employeeRepository.printEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employeeRepository.addEmployee(employee);
    }

    @Override
    public void editEmployee(Employee employee) {
        this.employeeRepository.editEmployee(employee);
    }

    @Override
    public void deleteEmployee(String name) {
        this.employeeRepository.deleteEmployee(name);
    }

    @Override
    public void findEmployee(String name) {
        this.employeeRepository.findEmployee(name);
    }
}
