package ge.example.sofgtgen_exam.controller;

import ge.example.sofgtgen_exam.model.Teacher;
import ge.example.sofgtgen_exam.service.TeachersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/teachers")
@RequiredArgsConstructor
@RestController
public class TeacherController {
    private final TeachersService teachersService;

    @GetMapping
    public List<Teacher> getTeacher() {
        return teachersService.getTeacher();
    }
    @PostMapping
    public ResponseEntity<Teacher> postTeacher(@RequestBody Teacher teacher) {
        return ResponseEntity.status(201).body(teachersService.postTeacher(teacher));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        try {
            teachersService.deleteTeacher(id);
            return ResponseEntity.noContent().build();
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable int id) {
        try {
            return ResponseEntity.ok(teachersService.get(id));
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("{id}")
    public ResponseEntity<Teacher> getStudentById(@PathVariable int id,
                                                  @RequestBody Teacher teacher) {
        try {
            teacher.setId(id);
            Teacher dbteacher = teachersService.putTeacher(teacher);
            return ResponseEntity.ok(dbteacher);
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
