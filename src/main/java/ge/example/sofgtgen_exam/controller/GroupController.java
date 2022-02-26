package ge.example.sofgtgen_exam.controller;

import ge.example.sofgtgen_exam.model.Group;
import ge.example.sofgtgen_exam.service.GroupsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/groups")
public class GroupController {
    private final GroupsService groupsService;

    @GetMapping
    public List<Group> getGroups() {
        return groupsService.getGroup();
    }
    @PostMapping
    public ResponseEntity<Group> postGroup(@RequestBody Group group) {
        return ResponseEntity.status(201).body(groupsService.postGroup(group));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable int id) {
        try {
            groupsService.deleteGroup(id);
            return ResponseEntity.noContent().build();
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("{id}")
    public ResponseEntity<Group> getGroupById(@PathVariable int id) {
        try {
            return ResponseEntity.ok(groupsService.get(id));
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("{id}")
    public ResponseEntity<Group> getStudentById(@PathVariable int id,
                                                  @RequestBody Group group) {
        try {
            group.setId(id);
            Group dbgroup = groupsService.putGroup(group);
            return ResponseEntity.ok(dbgroup);
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
