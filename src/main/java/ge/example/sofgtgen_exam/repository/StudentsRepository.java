package ge.example.sofgtgen_exam.repository;

import ge.example.sofgtgen_exam.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {
}
