package MVC.controller;

import MVC.model.Student;
import MVC.service.IStudentService;
import MVC.service.impl.StudentServiceImpl;

import java.util.List;

public class StudentController {

    private final IStudentService studentService = new StudentServiceImpl();

    public void createStudent(Student student) {
        this.studentService.createStudent(student);
    }

    public void removeStudent(int id) {
        this.studentService.removeStudent(id);
    }

    public List<Student> getStudents() {
        return this.studentService.getStudents();
    }
}
