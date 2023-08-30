package casestudy.service.impl;

import casestudy.model.Person.Customer;
import casestudy.respository.ICustomerRepository;
import casestudy.respository.impl.CustomerRepository;
import casestudy.service.ICustomerService;

public class CustomerService implements ICustomerService {
    private final ICustomerRepository customerRepository = new CustomerRepository();
        @Override
        public void printCustomer() {
            this.customerRepository.printCustomer();
        }

        @Override
        public void addCustomer(Customer customer) {
            this.customerRepository.addCustomer(customer);
        }

        @Override
        public void editCustomer(Customer customer) {
            this.customerRepository.editCustomer(customer);
        }

        @Override
        public void deleteCustomer(int id) {
            this.customerRepository.deleteCustomer(id);
        }

        @Override
        public void findCustomer(String name) {
            this.customerRepository.findCustomer(name);
        }
    };

