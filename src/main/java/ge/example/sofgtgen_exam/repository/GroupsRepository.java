package ge.example.sofgtgen_exam.repository;

import ge.example.sofgtgen_exam.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsRepository extends JpaRepository <Group, Integer> {
}
