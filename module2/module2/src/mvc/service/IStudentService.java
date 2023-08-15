package MVC.service;

import MVC.model.Student;

import java.util.List;

public interface IStudentService {

    void createStudent(Student student);

    void removeStudent(int id);

    List<Student> getStudents();
}
