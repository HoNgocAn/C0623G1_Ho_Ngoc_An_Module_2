package casestudy.respository.impl;

import casestudy.model.Person.Employee;
import casestudy.respository.IEmployeeRepository;

import java.util.ArrayList;

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
                System.out.println("Không tìm thấy nhân viên cần sửa thông tin");
            }
        }
    }

    @Override
    public void deleteEmployee(int id) {
        for (Employee e : list) {
            if (e.getId()==id){
                this.list.remove(e);
                return;
            } else {
                System.out.println("Không tìm thấy nhân viên cần xóa");
            }
        }

    }

    @Override
    public void findEmployee(String name) {
        for(Employee e: list){
            if(e.getName().equals(name)){
                System.out.println(e);
            }else {
                System.out.println("Không tìm thấy nhân viên cần tìm kiếm");
            }
        }
    }
}
