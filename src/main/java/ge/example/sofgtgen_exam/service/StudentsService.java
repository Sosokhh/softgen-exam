package ge.example.sofgtgen_exam.service;

import ge.example.sofgtgen_exam.model.Student;

import java.util.List;

public interface StudentsService {
    List<Student> getStudent();
    Student postStudent(Student student);
    Student get(int id);
    void delete(int id);
    Student putStudent(Student student);
}
