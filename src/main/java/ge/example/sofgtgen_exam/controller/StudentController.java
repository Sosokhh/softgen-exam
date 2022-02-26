package ge.example.sofgtgen_exam.controller;

import ge.example.sofgtgen_exam.model.Student;
import ge.example.sofgtgen_exam.service.StudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/students")
@RequiredArgsConstructor
@RestController
public class StudentController {
    private final StudentsService studentsService;

    @GetMapping
    public List<Student> getStudent() {
        return studentsService.getStudent();
    }

    @PostMapping
    public ResponseEntity<Student> postStudent(@RequestBody Student student) {
        return ResponseEntity.status(201).body(studentsService.postStudent(student));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        try {
            studentsService.delete(id);
            return ResponseEntity.noContent().build();
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        try {
            return ResponseEntity.ok(studentsService.get(id));
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id,
                                                  @RequestBody Student student) {
        try {
            student.setId(id);
            Student dbstudent = studentsService.putStudent(student);
            return ResponseEntity.ok(dbstudent);
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
