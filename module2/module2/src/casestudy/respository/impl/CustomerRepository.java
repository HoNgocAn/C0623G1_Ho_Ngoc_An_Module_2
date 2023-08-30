package casestudy.respository.impl;

import casestudy.model.Person.Customer;
import casestudy.model.Person.Employee;
import casestudy.respository.ICustomerRepository;

import java.util.ArrayList;

public class CustomerRepository implements ICustomerRepository {
    private final ArrayList<Customer> list = new ArrayList<>();
    @Override
    public void printCustomer() {
        for (Customer c: list) {
            System.out.println(c);
        }

    }

    @Override
    public void addCustomer(Customer customer) {
        this.list.add(customer);
    }

    @Override
    public void editCustomer(Customer customer) {
        for (Customer c : list) {
            if (c.getName() == customer.getName()) {
                c.setCode(customer.getCode());
                c.setDateOfBirth(customer.getDateOfBirth());
                c.setGender(customer.getGender());
                c.setId(customer.getId());
                c.setNumbersPhone(customer.getNumbersPhone());
                c.setEmail(customer.getEmail());
                c.setTypeOfQuest(customer.getTypeOfQuest());
                c.setAdress(customer.getAdress());
                return;
            } else {
                System.out.println("Không tìm thấy khách hàng cần sửa thông tin");
            }
        }
    }

    @Override
    public void deleteCustomer(int id) {
        for (Customer c : list) {
            if (c.getId()==id){
                this.list.remove(c);
                return;
            }else{
                System.out.println("Không tìm thấy khách hàng cần xóa");
            }
        }

    }

    @Override
    public void findCustomer(String name) {
        for(Customer c: list){
            if(c.getName().equals(name)){
                System.out.println(c);
            }else{
                System.out.println("Không tìm thấy khách hàng cần tìm kiếm");
            }
        }

    }
}
