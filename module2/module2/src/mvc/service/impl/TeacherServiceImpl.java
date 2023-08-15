package MVC.service.impl;

import MVC.model.Teacher;
import MVC.repository.ITeacherRepository;
import MVC.repository.impl.TeacherRepositoryImpl;
import MVC.service.ITeacherService;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService {


    private final ITeacherRepository teacherRepository = new TeacherRepositoryImpl();

    @Override
    public void createTeacher(Teacher teacher) {
        this.teacherRepository.createTeacher(teacher);
    }

    @Override
    public void removeTeacher(int id) {
        this.teacherRepository.removeTeacher(id);
    }

    @Override
    public List<Teacher> getTeachers() {
        return this.teacherRepository.getTeachers();
    }
}
