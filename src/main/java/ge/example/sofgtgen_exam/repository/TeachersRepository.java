package ge.example.sofgtgen_exam.repository;

import ge.example.sofgtgen_exam.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<Teacher, Integer> {
}
