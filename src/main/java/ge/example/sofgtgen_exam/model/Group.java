package ge.example.sofgtgen_exam.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "groups")
@SequenceGenerator(name = "groupsIdGenerator", sequenceName = "groups_id_seq", allocationSize = 1)
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groupsIdGenerator")
    public Integer id;
    @Column(name = "title")
    public String title;
    @Column(name = "group_no")
    public String groupNo;

}
