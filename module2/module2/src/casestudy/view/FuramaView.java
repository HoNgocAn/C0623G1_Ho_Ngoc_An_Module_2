package casestudy.view;

import casestudy.controller.EmployeeController;
import casestudy.model.Person.Employee;

import java.util.Scanner;

public class FuramaView {
    private final EmployeeController employeeController = new EmployeeController();
    private final Scanner scanner = new Scanner(System.in);
    private String code;
    private String name;
    private String name1;
    private String dateOfBirth;
    private int id;
    private int numbersPhone;
    private String email;
    private String level;
    private String title;
    private double salary;


    public void run(){
        int option = this.intMainMenu();
        int option1;
        switch (option){
            case 1:
                option1 = this.inputEmployeeManagement();
                this.employeeManagementMenu(option1);
                break;
            case 2:
                this.inputCustomerManagement();
                break;
            case 3:
                this.inputFacilityManagement();
                break;
            case 4:
                this.inputBookingManagerment();
                break;
            case 5:
                this.inputPromotionManagement() ;
                break;
            case 6:
                System.exit(option);
            default:
                //Todo;
                break;
        }
    }
    private void displayMainMenu(){
        System.out.println("----MainMenu----");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }
    private int intMainMenu() {
        int option = 0;
        do {
            try {
                this.displayMainMenu();
                System.out.println("Mời bạn chọn chức năng: ");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception ex) {
                System.out.println("Dữ liệu bạn nhập bị sai");
            }
        } while (option <= 0 || option > 6);
        return option;
    }
    private void employeeManagement(){
        System.out.println("----employeeManagement----");
        System.out.println("1 Display list employees");
        System.out.println("2 Add new employee");
        System.out.println("3 Edit employee");
        System.out.println("4 Delete employee");
        System.out.println("5 Search by name employee");
        System.out.println("6 Return main menu");
    }
    private void customerManagement(){
        System.out.println("----customerManagement----");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
    }
    private void facilityManagement(){
        System.out.println("----facilityManagement----");
        System.out.println("1 Display list facility");
        System.out.println("2 Add new facility");
        System.out.println("3 Display list facility maintenance");
        System.out.println("4 Delete facility");
        System.out.println("5 Return main menu");
    }
    private void bookingManagerment(){
        System.out.println("----bookingManagerment----");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
    }
    private void promotionManagement(){
        System.out.println("----bookingManagerment----");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
    }
    private int inputEmployeeManagement() {
        int option1 = 0;
        do {
            try {
                this.employeeManagement();
                System.out.println("Mời bạn chọn chức năng ");
                option1 = Integer.parseInt(scanner.nextLine());
            } catch (Exception ex) {
                System.out.println("Dữ liệu bạn nhập bị sai");
            }
        } while (option1 <= 0 || option1 > 6);
        return option1 ;
    }
    private int inputCustomerManagement() {
        int option2 = 0;
        do {
            try {
                this.customerManagement();
                System.out.println("Mời bạn chọn chức năng ");
                option2 = Integer.parseInt(scanner.nextLine());
            } catch (Exception ex) {
                System.out.println("Dữ liệu bạn nhập bị sai");
            }
        } while (option2 <= 0 || option2 > 6);
        return option2 ;
    }
    private int inputFacilityManagement() {
        int option3 = 0;
        do {
            try {
                this.facilityManagement();
                System.out.println("Mời bạn chọn chức năng ");
                option3 = Integer.parseInt(scanner.nextLine());
            } catch (Exception ex) {
                System.out.println("Dữ liệu bạn nhập bị sai");
            }
        } while (option3 <= 0 || option3 > 5);
        return option3 ;
    }
    private int inputBookingManagerment() {
        int option4 = 0;
        do {
            try {
                this.bookingManagerment();
                System.out.println("Mời bạn chọn chức năng ");
                option4 = Integer.parseInt(scanner.nextLine());
            } catch (Exception ex) {
                System.out.println("Dữ liệu bạn nhập bị sai");
            }
        } while (option4 <= 0 || option4 > 6);
        return option4;
    }
    private int inputPromotionManagement() {
        int option5 = 0;
        do {
            try {
                this.promotionManagement();
                System.out.println("Mời bạn chọn chức năng ");
                option5 = Integer.parseInt(scanner.nextLine());
            } catch (Exception ex) {
                System.out.println("Dữ liệu bạn nhập bị sai");
            }
        } while (option5 <= 0 || option5 > 3);
        return option5;
    }
    private void employeeManagementMenu(int option1){
        switch (option1){
            case 1:
                employeeController.printEmployee();
                break;
            case 2:
                System.out.println("Nhập mã nhân viên");
                code = scanner.nextLine();
                System.out.println("Nhập họ tên nhân viên");
                name = scanner.nextLine();
                System.out.println("Nhập ngày, tháng, năm sinh nhân viên");
                dateOfBirth = scanner.nextLine();
                System.out.println("Nhập số CMND của nhân viên");
                id = scanner.nextInt();
                System.out.println("Nhập số điện thoại của nhân viên");
                numbersPhone = scanner.nextInt();
                System.out.println("Nhập địa chỉ email của nhân viên");
                email = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Nhập trình độ của nhân viên");
                level = scanner.nextLine();
                System.out.println("Nhập vị trí của nhân viên");
                title = scanner.nextLine();
                System.out.println("Nhập lương của nhân viên");
                salary = scanner.nextDouble();
                Employee employee = new Employee(code,name,dateOfBirth,id,numbersPhone,email,level,title,salary);
                employeeController.addEmployee(employee);
                employeeController.printEmployee();
                scanner.nextLine();
                break;
            case 3:
                System.out.println("Nhập tên nhân viên");
                String name = scanner.nextLine();
                Employee employee1 = new Employee();
                employee1.setName(name);
                System.out.println("Nhập lại mã nhân viên");
                code = scanner.nextLine();
                System.out.println("Nhập lại ngày, tháng, năm sinh");
                dateOfBirth = scanner.nextLine();
                System.out.println("Nhập lại id ");
                id = scanner.nextInt();
                System.out.println("Nhập lại số điện thoại");
                numbersPhone = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập lại email");
                email = scanner.nextLine();
                System.out.println("Nhập lại trình độ");
                level = scanner.nextLine();
                System.out.println("Nhập lại vị trí");
                title = scanner.nextLine();
                System.out.println("Nhập lại lương");
                salary = scanner.nextDouble();
                employee1.setCode(code);
                employee1.setDateOfBirth(dateOfBirth);
                employee1.setId(id);
                employee1.setNumbersPhone(numbersPhone);
                employee1.setEmail(email);
                employee1.setLevel(level);
                employee1.setTitle(title);
                employee1.setSalary(salary);
                employeeController.editEmployee(employee1);
                employeeController.printEmployee();
                scanner.nextLine();
                break;
            case 4:
                System.out.println("Nhập tên nhân viên muốn xóa");
                name = scanner.nextLine();
                employeeController.deleteEmployee(name);
                employeeController.printEmployee();
                break;
            case 5:
                System.out.println("Nhập tên nhân viên cần tìm kiếm");
                name1 = scanner.nextLine();
                System.out.println("Kết quả tìm kiếm");
                employeeController.printEmployee(name1);
                break;
            case 6:
                this.run();
                break;
            default:
                break;
        }
        this.inputEmployeeManagement();
    }
}
