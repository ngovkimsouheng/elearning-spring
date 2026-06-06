package co.istad.souheng.elearning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String biography;
    private String facebookLink;
    private String githubLink;
    private String major;
    private String phoneNumber;
    private String university;

}
