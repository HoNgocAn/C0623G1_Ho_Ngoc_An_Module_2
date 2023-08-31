package casestudy.respository.impl;

import casestudy.Utils.FileUtils;
import casestudy.model.Person.Customer;
import casestudy.model.Person.Employee;
import casestudy.respository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final ArrayList<Customer> list = new ArrayList<>();
    private static final String COMMA = ",";
    private static final String PATH_NAME = "D:\\C0623G1_Ho_Ngoc_An_Module_2\\module2\\module2\\src\\casestudy\\Data\\Customer.csv";
    @Override
    public void printCustomer() {
        for (Customer c: list) {
            System.out.println(c);
        }

    }

    @Override
    public void addCustomer(Customer customer) {
        this.list.add(customer);
        FileUtils.writeFile(PATH_NAME,convertToString(list));
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
        FileUtils.writeFile(PATH_NAME,convertToString(list));
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
        FileUtils.writeFile(PATH_NAME,convertToString(list));
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
    public List<Employee> convertToEmployee() {
        List<Employee> customerList = new ArrayList<>();
        List<String> stringList = FileUtils.readFile(PATH_NAME);
        String[] array;
        for (String employee : stringList) {
            array = employee.split(COMMA);
            customerList.add(new Employee(
                    array[0],
                    array[1],
                    array[2],
                    array[3],
                    Integer.parseInt(array[4]),
                    Integer.parseInt(array[5]),
                    array[6],
                    array[7],
                    array[8],
                    Double.parseDouble(array[9])));
        }
        return customerList;
    }

    public List<String> convertToString(ArrayList<Customer> employeeList) {
        List<String> customerStringList = new ArrayList<>();
        for (Customer customer: employeeList) {
            customerStringList.add(customer.getCode() + COMMA +
                    customer.getName() + COMMA +
                    customer.getDateOfBirth() + COMMA +
                    customer.getGender() + COMMA +
                    customer.getId() + COMMA +
                    customer.getNumbersPhone() + COMMA +
                    customer.getEmail() + COMMA +
                    customer.getTypeOfQuest() + COMMA +
                    customer.getAdress() + COMMA);
        }
        return customerStringList;
    }
}
