package ge.example.sofgtgen_exam.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "students")
@SequenceGenerator(name = "studentsIdGenerator", sequenceName = "students_id_seq", allocationSize = 1)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentsIdGenerator")
    public Integer id;
    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    @Column(name = "personal_no")
    public Integer personalNo;
    @Column(name = "email")
    public String email;
    @Column(name = "birth_date")
    public LocalDate birthDate;

}
