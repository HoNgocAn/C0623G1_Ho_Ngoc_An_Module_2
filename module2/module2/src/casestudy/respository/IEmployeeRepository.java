package casestudy.respository;

import casestudy.model.Person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository{
    void printEmployee();
    void addEmployee(Employee employee);
    void editEmployee(Employee employee);
    void deleteEmployee(int id);
    void findEmployee(String name);

}
