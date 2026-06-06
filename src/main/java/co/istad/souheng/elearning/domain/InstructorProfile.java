package co.istad.souheng.elearning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "instructor_profiles")
public class InstructorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String biography;
    private String facebookLink;
    private String githubLink;
    private String jobTitle;
    private String phoneNumber;

    @OneToMany(mappedBy = "instructorProfile")
    private List<Course> courses;
}
