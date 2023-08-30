package casestudy.respository;

import casestudy.model.Person.Customer;

public interface ICustomerRepository extends IRepository{
    void printCustomer();
    void addCustomer(Customer customer);
    void editCustomer(Customer customer);
    void deleteCustomer(int id);
    void findCustomer(String name);
}
