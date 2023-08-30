package casestudy.respository;

import casestudy.model.Person.Employee;

public interface IEmployeeRepository extends IRepository{
    void printEmployee();
    void addEmployee(Employee employee);
    void editEmployee(Employee employee);
    void deleteEmployee(String name);
    void findEmployee(String name);

}
