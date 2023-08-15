package MVC.controller;

import MVC.model.Teacher;
import MVC.service.ITeacherService;
import MVC.service.impl.TeacherServiceImpl;

import java.util.List;

public class TeacherController {

    private final ITeacherService teacherService = new TeacherServiceImpl();

    public void createTeacher(Teacher teacher) {
        this.teacherService.createTeacher(teacher);
    }

    public void removeTeacher(int id) {
        this.teacherService.removeTeacher(id);
    }

    public List<Teacher> getTeachers() {
        return this.teacherService.getTeachers();
    }
}
