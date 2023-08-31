package casestudy.respository.impl;

import casestudy.model.Person.Employee;
import casestudy.respository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final ArrayList<Employee> list = new ArrayList<>();
    @Override
    public void printEmployee() {
        for (Employee e: list) {
            System.out.println(e);
        }

    }

    @Override
    public void addEmployee(Employee employee) {
        this.list.add(employee);
    }

    @Override
    public void editEmployee(Employee employee) {
        int index = 0;
        for (Employee e : list) {
            if (e.getId()==employee.getId()){
                e.setCode(employee.getCode());
                e.setName(employee.getName());
                e.setDateOfBirth(employee.getDateOfBirth());
                e.setGender(employee.getGender());
                e.setNumbersPhone(employee.getNumbersPhone());
                e.setEmail(employee.getEmail());
                e.setLevel(employee.getLevel());
                e.setTitle(employee.getTitle());
                e.setSalary(employee.getSalary());
                return;
            }else{
                index++;
            }
        }
        if (index != 0) {
            System.out.println("Không tìm thấy nhân viên cần sửa");
        } else {
            System.out.println("Đã sửa thông tin nhân viên");
        }
    }

    @Override
    public void deleteEmployee(int id) {
        int index1 = 0;
        for (Employee e : list) {
            if (e.getId()==id){
                this.list.remove(e);
                return;
            } else {
                index1++;
            }
        }
        if (index1 != 0) {
            System.out.println("Không tìm thấy nhân viên cần xóa");
        } else {
            System.out.println("Đã xóa thông tin nhân viên");
        }

    }

    @Override
    public void findEmployee(String name) {
        int index2 = 0;
        for(Employee e: list){
            if(e.getName().equals(name)){
                System.out.println(e);
            }else {
                index2++;
            }
        }
        if (index2 != 0) {
            System.out.println("Không tìm thấy nhân viên có tên như trên");
        } else {
            System.out.println("Đã tìm thấy nhân viên");
        }
    }
}

