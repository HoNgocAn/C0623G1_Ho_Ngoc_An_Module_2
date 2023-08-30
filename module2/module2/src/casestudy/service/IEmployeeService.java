package casestudy.service;

import casestudy.model.Person.Employee;

public interface IEmployeeService extends IService{
    void printEmployee();
    void addEmployee(Employee employee);
    void editEmployee(Employee employee);
    void deleteEmployee(String name);
    void findEmployee(String name);
}
