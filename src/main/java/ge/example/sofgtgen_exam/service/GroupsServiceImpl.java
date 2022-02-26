package ge.example.sofgtgen_exam.service;

import ge.example.sofgtgen_exam.model.Group;
import ge.example.sofgtgen_exam.repository.GroupsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GroupsServiceImpl implements GroupsService{
    private final GroupsRepository groupsRepository;


    public List<Group> getGroup() {
        return groupsRepository.findAll();
    }
    public Group postGroup (Group group) {
        return groupsRepository.save(group);
    }
    public Group get(int id) {
        return groupsRepository.findById(id).orElseThrow();
    }
    public void deleteGroup(int id) {
        groupsRepository.delete(get(id));
    }
    public Group putGroup(Group group) {
        get(group.getId());
        return groupsRepository.save(group);
    }
}
