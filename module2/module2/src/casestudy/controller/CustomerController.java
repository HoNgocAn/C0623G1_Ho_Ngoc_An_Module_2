package casestudy.controller;

import casestudy.model.Person.Customer;
import casestudy.model.Person.Employee;
import casestudy.respository.ICustomerRepository;
import casestudy.service.ICustomerService;
import casestudy.service.impl.CustomerService;

public class CustomerController {
    private final ICustomerService customerService = new CustomerService();
    public void printCustomer(){this.customerService.printCustomer();}
    public void addCustomer(Customer customer){this.customerService.addCustomer(customer);}
    public void editCustomer(Customer customer){this.customerService.editCustomer(customer);}
    public void deleteCustomer(int id){this.customerService.deleteCustomer(id);}
    public void findCustomer(String name1){this.customerService.findCustomer(name1);}
}
