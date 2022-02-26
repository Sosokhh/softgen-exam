package ge.example.sofgtgen_exam.service;

import ge.example.sofgtgen_exam.model.Student;
import ge.example.sofgtgen_exam.repository.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentsServiceImpl implements StudentsService{

    private final StudentsRepository studentsRepository;

    public List<Student> getStudent() {
        return studentsRepository.findAll();
    }

    public Student postStudent(Student student) {
        return studentsRepository.save(student);
    }
    public Student get(int id) {
        return studentsRepository.findById(id).orElseThrow();
    }
    public void delete(int id) {
         studentsRepository.delete(get(id));
    }
    public Student putStudent(Student student) {
        get(student.getId());
        return studentsRepository.save(student);
    }
}
