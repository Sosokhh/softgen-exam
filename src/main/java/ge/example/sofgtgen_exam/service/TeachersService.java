package ge.example.sofgtgen_exam.service;

import ge.example.sofgtgen_exam.model.Teacher;

import java.util.List;

public interface TeachersService {
    List<Teacher> getTeacher();
    Teacher postTeacher(Teacher teacher);
    Teacher get(int id);
    void deleteTeacher(int id);
    Teacher putTeacher(Teacher teacher);
}
