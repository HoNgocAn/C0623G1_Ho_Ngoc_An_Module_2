package casestudy.service;

import casestudy.model.Person.Customer;
import casestudy.model.Person.Employee;

public interface ICustomerService extends IService{
    void printCustomer();
    void addCustomer(Customer customer);
    void editCustomer(Customer customer);
    void deleteCustomer(int id);
    void findCustomer(String name);
}
