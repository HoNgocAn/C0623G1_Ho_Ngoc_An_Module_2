package MVC.service.impl;

import MVC.model.Student;
import MVC.repository.IStudentRepository;
import MVC.repository.impl.StudentRepositoryImpl;
import MVC.service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {


    private final IStudentRepository studentRepository = new StudentRepositoryImpl();


    @Override
    public void createStudent(Student student) {
        this.studentRepository.createStudent(student);
    }

    @Override
    public void removeStudent(int id) {
        this.studentRepository.removeStudent(id);
    }

    @Override
    public List<Student> getStudents() {
        return this.studentRepository.getStudents();
    }
}
