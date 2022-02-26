package ge.example.sofgtgen_exam.service;

import ge.example.sofgtgen_exam.model.Teacher;
import ge.example.sofgtgen_exam.repository.TeachersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TeachersServiceImpl implements TeachersService{
    private final TeachersRepository teachersRepository;

    public List<Teacher> getTeacher() {
        return teachersRepository.findAll();
    }
    public Teacher postTeacher(Teacher teacher) {
        return teachersRepository.save(teacher);
    }
    public Teacher get(int id) {
        return teachersRepository.findById(id).orElseThrow();
    }
    public void deleteTeacher(int id) {
        teachersRepository.delete(get(id));
    }
    public Teacher putTeacher(Teacher teacher) {
        get(teacher.getId());
        return teachersRepository.save(teacher);
    }

}
