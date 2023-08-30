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
            if (e.getName()==employee.getName()){
                e.setCode(employee.getCode());
                e.setDateOfBirth(employee.getDateOfBirth());
                e.setId(employee.getId());
                e.setNumbersPhone(employee.getNumbersPhone());
                e.setEmail(employee.getEmail());
                e.setLevel(employee.getLevel());
                e.setTitle(employee.getTitle());
                e.setSalary(employee.getSalary());
                return;
            }
        }
    }

    @Override
    public void deleteEmployee(String name) {
        for (Employee e : list) {
            if (e.getName()==name){
                this.list.remove(e);
                return;
            }
        }

    }

    @Override
    public void findEmployee(String name) {
        for(Employee e: list){
            if(e.getName().indexOf(name)>0){
                System.out.println(e);
            }
        }
    }
}
