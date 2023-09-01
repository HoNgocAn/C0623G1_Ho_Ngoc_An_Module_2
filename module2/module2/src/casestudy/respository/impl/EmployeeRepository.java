package casestudy.respository.impl;

import casestudy.Utils.FileUtils;
import casestudy.model.Person.Employee;
import casestudy.respository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final ArrayList<Employee> list = new ArrayList<>();
    private static final String COMMA = ",";
    private static final String PATH_NAME = "D:\\C0623G1_Ho_Ngoc_An_Module_2\\module2\\module2\\src\\casestudy\\Data\\Employee.csv";

    @Override
    public void printEmployee() {
        for (Employee e : list) {
            System.out.println(e);
        }

    }

    @Override
    public void addEmployee(Employee employee) {
        this.list.add(employee);
        System.out.println("Đã thêm mới nhân viên");
        FileUtils.writeFile(PATH_NAME,convertToString(list));
    }

    @Override
    public void editEmployee(Employee employee) {
        int index = 0;
        for (Employee e : list) {
            if (e.getId() == employee.getId()) {
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
            } else {
                index++;
            }
        }
        if (index != 0) {
            System.out.println("Không tìm thấy nhân viên cần sửa");
        } else {
            System.out.println("Đã sửa thông tin nhân viên");
        }
        FileUtils.writeFile(PATH_NAME,convertToString(list));
    }

    @Override
    public void deleteEmployee(int id) {
        int index1 = 0;
        for (Employee e : list) {
            if (e.getId() == id) {
                this.list.remove(e);
                System.out.println("Đã xóa thông tin nhân viên");
                return;
            } else {
                index1++;
            }
        }
        if (index1 != 0) {
            System.out.println("Không tìm thấy nhân viên cần xóa");
        }
        FileUtils.writeFile(PATH_NAME,convertToString(list));

    }

    @Override
    public void findEmployee(String name) {
        int index2 = 0;
        for (Employee e : list) {
            if (e.getName().equals(name)) {
                System.out.println(e);
                System.out.println("Đã tìm thấy nhân viên");
            } else {
                index2++;
            }
        }
        if (index2 != 0) {
            System.out.println("Không tìm thấy nhân viên có tên như trên");
        }
    }

    public List<Employee> convertToEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = FileUtils.readFile(PATH_NAME);
        String[] array;
        for (String employee : stringList) {
            array = employee.split(COMMA);
            employeeList.add(new Employee(
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
        return employeeList;
    }

    public List<String> convertToString(List<Employee> employeeList) {
        List<String> employeeStringList = new ArrayList<>();
        for (Employee emp : employeeList) {
            employeeStringList.add(emp.getCode() + COMMA +
                    emp.getName() + COMMA +
                    emp.getDateOfBirth() + COMMA +
                    emp.getGender() + COMMA +
                    emp.getId() + COMMA +
                    emp.getNumbersPhone() + COMMA +
                    emp.getEmail() + COMMA +
                    emp.getLevel() + COMMA +
                    emp.getTitle() + COMMA +
                    emp.getSalary());
        }
        return employeeStringList;
    }
}

