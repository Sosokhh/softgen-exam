package ge.example.sofgtgen_exam.service;

import ge.example.sofgtgen_exam.model.Group;

import java.util.List;

public interface GroupsService {
    List<Group> getGroup();
    Group postGroup (Group group);
    Group get(int id);
    void deleteGroup(int id);
    Group putGroup(Group group);
}
