package casestudy.model.Person;

public class Employee extends Person{
    private String level;
    private String title;
    private double salary;



    public Employee(String code, String name, String dateOfBirth, String gender, int id, int numbersPhone, String email, String level, String title, double salary) {
        super(code, name, dateOfBirth, gender, id, numbersPhone, email);
        this.level = level;
        this.title = title;
        this.salary = salary;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "Employee {" + super.toString() + ", level='" + level + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary + "}";
    }

//    public Employee(String code, String name, String dateOfBirth, String gender, String id, String numbersPhone, String email, String level, String title, String salary) {
//        super(code, name, dateOfBirth, gender, id, numbersPhone, email);
//        this.level = level;
//        this.title = title;
//        this.salary = salary;
//    }
//
//    public String getLevel() {
//        return level;
//    }
//
//    public void setLevel(String level) {
//        this.level = level;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "level='" + level + '\'' +
//                ", title='" + title + '\'' +
//                ", salary=" + salary +
//                "} " + super.toString();
//    }
}
