package MVC.service;

import MVC.model.Teacher;

import java.util.List;

public interface ITeacherService {

    void createTeacher(Teacher teacher);

    void removeTeacher(int id);


    List<Teacher> getTeachers();

}
