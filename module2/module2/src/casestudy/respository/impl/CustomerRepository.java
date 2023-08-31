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
        int index = 0;

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
            }
        }
        if (index != 0) {
            System.out.println("Không tìm thấy khách hàng cần sửa");
        } else {
            System.out.println("Đã sửa thông tin khách hàng");
        }
    }

    @Override
    public void deleteCustomer(int id) {
        int index1 = 0;
        for (Customer c : list) {
            if (c.getId() == id) {
                this.list.remove(c);
                return;
            }
        }
        if (index1 != 0) {
            System.out.println("Không tìm thấy khách hàng cần xóa");
        } else {
            System.out.println("Đã xóa khách hàng");
        }
    }

    @Override
    public void findCustomer(String name) {
        int index2 = 0;
        for(Customer c: list){
            if(c.getName().equals(name)){
                System.out.println(c);
                return;
            }
        }
        if (index2 != 0) {
            System.out.println("Không tìm thấy khách hàng có tên như trên");
        } else {
            System.out.println("Đã tìm thấy khách hàng cần tìm");
        }
    }
}
